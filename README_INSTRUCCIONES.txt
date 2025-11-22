==========================================
CALCULADORA DE BIORREACTORES
==========================================

Este proyecto conecta un frontend web con tu backend Java existente.

REQUISITOS:
-----------
- Java 8 o superior
- Navegador web moderno (Chrome, Firefox, Edge, Safari)

INSTALACIÓN Y USO:
------------------

1. COMPILAR EL PROYECTO (Linux/Mac):

   chmod +x compile.sh
   ./compile.sh

   COMPILAR EL PROYECTO (Windows):

   Descarga manualmente json-20230227.jar de:
   https://repo1.maven.org/maven2/org/json/json/20230227/json-20230227.jar

   Guárdalo en la carpeta "lib"

   Luego ejecuta:
   javac -cp "lib/json.jar;." -d bin src/src/com/DAO/*.java src/src/com/server/*.java

2. INICIAR EL SERVIDOR (Linux/Mac):

   chmod +x run.sh
   ./run.sh

   INICIAR EL SERVIDOR (Windows):

   java -cp "bin;lib/json.jar" src.com.server.BioreactorServlet

3. ABRIR EL FRONTEND:

   Abre en tu navegador el archivo:
   frontend/index.html

   O también puedes usar un servidor web simple:
   - Con Python 3: python3 -m http.server 3000
   - Luego abre: http://localhost:3000/frontend/

USO DE LA APLICACIÓN:
---------------------

1. Selecciona el tipo de biorreactor (Air-Lift o Tanque Agitado)
2. Llena el formulario con los datos requeridos
3. Haz clic en "Calcular Biorreactor"
4. Los resultados aparecerán en pantalla
5. IMPORTANTE: Toma una captura de pantalla si deseas guardar los datos
6. Usa el botón "Crear Nuevo Biorreactor" para hacer otro cálculo
7. Usa el botón "Imprimir Resultados" para imprimir la página

CARACTERÍSTICAS:
----------------

- Sin base de datos (no almacena datos)
- Cálculos en tiempo real
- Interfaz amigable y responsiva
- Dos tipos de biorreactores: Air-Lift y Tanque Agitado
- Resultados inmediatos
- Opción de impresión

SOLUCIÓN DE PROBLEMAS:
----------------------

Si aparece un error de conexión:
- Verifica que el servidor Java esté ejecutándose
- Confirma que el puerto 8080 esté libre
- Revisa que no haya firewall bloqueando el puerto

Si no compila:
- Verifica que tienes Java 8 o superior: java -version
- Asegúrate de que la librería json.jar esté en la carpeta lib/

==========================================
