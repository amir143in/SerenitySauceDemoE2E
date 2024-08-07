README - Instrucciones para la Ejecución del Proyecto Serenity BDD con JUnit4 y Java, Gradle

Paso 1: Requisitos Previos
--------------------------
1. Asegúrate de tener instalado Java (JDK 8 o superior).
2. Asegúrate de tener instalado Gradle.
3. Configura las variables de entorno JAVA_HOME y GRADLE_HOME correctamente.
4. Asegúrate de tener configurado el PATH para incluir Gradle.

Paso 2: Clonar el Repositorio
------------------------------
1. Abre una terminal o consola.
2. Clonar el repositorio del proyecto desde GitHub:  git clone <URL_DEL_REPOSITORIO>
3. Navegar al Directorio del Proyecto: cd <NOMBRE_DEL_PROYECTO>
4. Ejecutar los Tests: gradle clean test aggregate
5. Ver los Resultados de las Pruebas
    - Una vez completada la ejecución, abre el informe generado en tu navegador.
      El informe se encuentra en la siguiente ruta: build/reports/tests/test/index.html o target/site/serenity/index.html
Nota:
Si encuentras algún problema al ejecutar los comandos, asegúrate de que todos los requisitos previos estén correctamente configurados.
