#!/bin/bash

echo "Iniciando servidor del biorreactor en puerto 8080..."
java -cp 'bin:lib/json.jar' src.com.server.BioreactorServlet
