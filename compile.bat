@echo off
echo Compilando proyecto...

:: Compilar incluyendo la libreria JSON
javac -cp "lib/*" -d bin src/src/com/server/BioreactorServlet.java src/src/com/DAO/*.java src/src/com/Aritmetic/*.java src/src/com/MAIN/*.java

if %ERRORLEVEL% EQU 0 (
    echo Compilacion exitosa!
) else (
    echo Error en la compilacion
)

pause
