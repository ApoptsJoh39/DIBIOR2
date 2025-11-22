@echo off
echo Iniciando servidor del biorreactor en puerto 8080...
echo.
echo IMPORTANTE: Abre frontend/index.html en tu navegador
echo.

java -cp "bin;lib/*" src.com.server.BioreactorServlet

pause
