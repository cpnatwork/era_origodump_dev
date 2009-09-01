@echo off
SetLocal EnableDelayedExpansion

rem ***************************************************************************
rem * author: Christoph Peter Neumann
rem ***************************************************************************

echo.
echo INFO: delete rif, rif.edit, and rif.genediter
rmdir /s /q era.foss.model.rif
rmdir /s /q era.foss.model.rif.edit
rmdir /s /q era.foss.model.rif.geneditor

echo.
echo INFO: SVN update of rif, rif.edit, and rif.genediter
set SVN_SSH=plink -ssh -2 -A
svn update era.foss.model.rif
svn update era.foss.model.rif.edit
svn update era.foss.model.rif.geneditor

echo.
echo INFO: Check - Do you have valid junction points in targetplatforms?
echo INFO: Step1 - update the projects in Eclipse!
echo INFO: Step2 - do the era.internal.build build.xml target all for regeneration!
echo INFO: Step3 - update the projects in Eclipse, again!
echo INFO: Step4 - wait until the Eclipse auto-build is finished!

pause