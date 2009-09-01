@echo off
SetLocal EnableDelayedExpansion

rem ***************************************************************************
rem * author: Christoph Peter Neumann
rem ***************************************************************************

set SVN_SSH=plink -ssh -2 -A
svn update

pause