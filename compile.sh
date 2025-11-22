#!/bin/bash

echo "Descargando librería JSON..."
mkdir -p lib
cd lib
wget https://repo1.maven.org/maven2/org/json/json/20230227/json-20230227.jar -O json.jar
cd ..

echo "Compilando proyecto..."
javac -cp "lib/json.jar:." -d bin src/src/com/DAO/*.java src/src/com/server/*.java

echo "Compilación completada!"
echo ""
echo "Para ejecutar el servidor, usa:"
echo "java -cp 'bin:lib/json.jar' src.com.server.BioreactorServlet"
