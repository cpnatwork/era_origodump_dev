@echo off
SETLOCAL EnableDelayedExpansion

rem ***************************************************************************
rem * WARNING: Check that the value in SVN_SSH has the backslashes escaped (or use forward slashes)
set SSHEXE="U:/progs_cpn/binwin/plink.exe"
set SSHKEY="U:/data_cpn/Documents/SecurityCerts/KeyPair - SSH - Zweck L6/Christoph Neumann - Zweck L6 - putty/Christoph_Neumann.L6.ppk"
set SVN_SSH=%SSHEXE% -i %SSHKEY%

rem ***************************************************************************
rem * Required for statsvn.jar!!
set SVNUSERNAME=%USERNAME%
set SVNPASSWORD=%~1

rem ***************************************************************************
rem * Basic 
set PROJROOTDIR=.
set SVNLOGXMLFILE=svnlog.xml
set INITIALREVISION=113
set INCLUDEFILTER=**/*.java:**/*.properties:**/*.xml:**/*.jsp:**/*.js:**/*.css:**/*.html:**/*.txt:**/*.cmd:**/*.bt:**/*.sh:**/*.genmodel:**/*.ecore:**/*.atl
set GLOBALIGNOREFILTER=**/bin/**

rem ***************************************************************************
rem * CODE 
rem ***************************************************************************

del %SVNLOGXMLFILE%

set EXEC=svn log "%PROJROOTDIR%" --xml -v -r BASE:%INITIALREVISION%
echo EXEC: !EXEC! (pipe to: "%SVNLOGXMLFILE%")
cmd /D/C !EXEC! > "%SVNLOGXMLFILE%"

rem ***********************************
rem * all
mkdir statsvn-all
set EXEC=java -jar statsvn.jar "%SVNLOGXMLFILE%" "%PROJROOTDIR%" -output-dir statsvn-all -include %INCLUDEFILTER%" -exclude "%GLOBALIGNOREFILTER%" -username %USERNAME% -password %SVNPASSWORD%
echo EXEC: !EXEC!
cmd /D/C !EXEC!
