https://www.youtube.com/watch?v=WVblvdw7qe8

Comandos usado para encriptar información sensible con la aplicación jasypt-1.9.3.jar

Versión 1 - RandomIvGenerator:
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="usuariosecreto@sudominio.com" password="clave-jasypt" algorithm=PBEWITHHMACSHA512ANDAES_256 ivGeneratorClassName=org.jasypt.iv.RandomIvGenerator

Versión 2 - RandomSaltGenerator:
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="usuariosecreto@sudominio.com" password="clave-jasypt" algorithm=PBEWITHMD5ANDTRIPLEDES saltGeneratorClassName=org.jasypt.salt.RandomSaltGenerator




Diferencia entre RandomIvGenerator y RandomSaltGenerator en Jasypt
En el contexto de la criptografía y específicamente en la biblioteca Jasypt, tanto RandomIvGenerator como RandomSaltGenerator son componentes clave para generar valores aleatorios utilizados en los algoritmos de cifrado. Sin embargo, cumplen funciones distintas:


RandomIvGenerator (Vector de inicialización aleatorio)
Propósito: Un vector de inicialización (IV) es un valor aleatorio utilizado en los modos de cifrado en bloque para asegurar que el cifrado de dos bloques de texto plano idénticos produzca cifrados diferentes. Esto añade una capa adicional de aleatoriedad y seguridad al proceso de cifrado.

Funcionamiento: El RandomIvGenerator se encarga de generar un IV aleatorio de un tamaño específico para cada operación de cifrado. Este IV se combina con la clave de cifrado para producir un cifrado único.

Importancia: Un IV bien generado es esencial para la seguridad de muchos algoritmos de cifrado. Un IV débil o reutilizado puede comprometer la seguridad del sistema.


RandomSaltGenerator (Sal aleatoria)
Propósito: Una sal es un valor aleatorio que se agrega a una contraseña antes de aplicar una función hash. El propósito principal de la sal es hacer que los hashes de contraseñas idénticas sean diferentes, incluso si se utiliza la misma función hash. Esto dificulta los ataques de diccionario y precalculados.

Funcionamiento: El RandomSaltGenerator genera una sal aleatoria que se concatena con la contraseña antes de aplicar la función hash. La sal se almacena junto con el hash de la contraseña.

Importancia: La sal es una parte fundamental de los esquemas de almacenamiento de contraseñas seguros. Al agregar una sal aleatoria, se hace mucho más difícil para un atacante comprometer una base de datos de contraseñas hash.


Resumen de las diferencias
Característica			RandomIvGenerator							                RandomSaltGenerator
Propósito			Generar un valor aleatorio para el cifrado en bloque.			Generar un valor aleatorio para fortalecer el hash de contraseñas.
Uso				Se combina con la clave de cifrado para producir un cifrado único.	Se concatena con la contraseña antes de aplicar la función hash.
Impacto en la seguridad	Un 	IV débil puede comprometer la seguridad del cifrado.	Una sal débil puede facilitar ataques a bases de datos de contraseñas.

Dcoumentación:
https://www.baeldung.com/spring-boot-jasypt
https://www.geeksforgeeks.org/how-to-encrypt-passwords-in-a-spring-boot-project-using-jasypt/
https://github.com/BuntyRaghani/spring-boot-jasypt
https://iwconnect.com/jasypt-encryption-tool-with-spring-boot/
https://www.cnblogs.com/ealenxie/p/17956332