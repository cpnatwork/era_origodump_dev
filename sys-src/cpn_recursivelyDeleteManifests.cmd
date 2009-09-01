@echo off
SetLocal EnableDelayedExpansion

rem ***************************************************************************
rem * author: Christoph P. Neumann
rem ***************************************************************************

SET CHANGELIST=_%~n0.changelist

echo.
echo INFO: create changelist
dir /S /B MANIFEST.MF > %CHANGELIST%

echo.
echo INFO: delete all manifest files
del /S MANIFEST.MF
del /S MANIFEST.MF.mine
del /S MANIFEST.MF.r*

echo.
echo INFO: update according to changelist
set SVN_SSH=plink -ssh -2 -A
for /F %%F in (%CHANGELIST%) do (
	svn update  %%F
)

echo.
echo INFO: delete the changelist file
del %CHANGELIST%

pause