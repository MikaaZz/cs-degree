@echo off
setlocal enabledelayedexpansion

REM Set the number of files you want to create
set /p numFiles="Enter the number of files to create: "
set /p baseName="Enter the base name of the files (e.g., File): "

REM Loop to create the files
for /l %%i in (1,1,%numFiles%) do (
    set index=%%i
    set fileName=!baseName!!index!.java
    echo Creating !fileName!
    echo. > !fileName!
)

echo Files created successfully!

endlocal
