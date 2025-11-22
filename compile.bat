@echo off
echo Descargando libreria JSON...
mkdir lib 2>nul
cd lib
powershell -Command "Invoke-WebRequest -Uri 'https://repo1.maven.org/maven2/org/json/json/20230227/json-20230227.jar' -OutFile 'json.jar'"
cd ..

echo Compilando proyecto...
javac -cp "lib/json.jar;." -d bin src/src/com/DAO/*.java src/src/com/server/*.java

echo Compilacion completada!
echo.
echo Para ejecutar el servidor, usa:
echo run.bat
pause
