# Contact Us application

Java, AngularJS and Polymer Application

ContactUsApp es una aplicación desarrollada en tecnologías Java, AngularJS y Polymer para el registro de un formulario de contacto y una pantalla donde lista las solicitudes realizadas.

Los proyectos descritos a continuación:

-	AccesoDatosJDBC: Proyecto construido con el API JDBC de Java. Realiza la conexión a una base de datos Oracle XE 11.2 o Postgres, dependiendo de la necesidad. Utiliza el llamado a procedimientos almacenados para consultar y registrar la información.

-	AccesoDatosJPA: Proyecto construido con EclipseLink que utiliza la API JPA de Java. Realiza la conexión a la misma base de datos Oracle XE 11.2. Para registrar y consultar información hace uso de las herramientas del API como “persist” o “createNamedQuery”.

-	ContactUsAppAJS: Proyecto HTML que contiene los 2 formularios mencionados; registro de contacto y consulta de registros. Este proyecto utiliza AngularJS y JQuery para la comunicación del formulario de registro con su respectivo controlador y la comunicación con el web service. También, utiliza recursos Polymer para la construcción de los componentes necesarios en la pantalla de consulta de registros.

-	WS: RESTful web service que actúa como capa intermedia entre la aplicación web y la capa de persistencia de datos. Está construido con el framework Jersey que utiliza la API JAX-RS de Java. Aquí se exponen los métodos de consulta y registro de información.

Para la publicación del servicio y la aplicación web se utilizaron los siguientes servidores:
-	Apache Tomcat 8.0: Para los proyectos WS, AccesoDatosJDBC y AccesoDatosJPA.

-	Python: Para la aplicación ContactUsAppAJS.

NOTAS IMPORTANTES:

1.	Tanto el proyecto AccesoDatosJDBC como AccesoDatosJPA realizan las mismas tareas: registrar y consultar información en la base de datos. Es decir, El proyecto WS puede hacer la referencia a uno o al otro y el sistema funcionará de la misma manera.

2. El proyecto AccesoDatosJDBC utiliza un archivo .properties y una clase .enum para determinar la conexión a la base de datos que se va a utilizar, es decir, si queremos cambiar la conexión de base de datos necesitamos modificar estos 2 archivos: propiedades.properties y BaseDeDatos.java.

3.	El servidor Apache Tomcat 8.0 utiliza las librerías de conexión a bases de datos Oracle y PostgreSQL. Para esto, es necesario que en la carpeta lib/ de nuestro servidor se encuentre el archivo ojdbc7.jar y postgresql-9.4-1201.jdbc4.jar (Se encuentran en la capeta lib/ del repositorio).

4.	Para evitar el error “Access-Control-Allow-Origin” al consumir un servicio desde una aplicación que se encuentran en diferentes hosts es necesario que en la carpeta lib/ de nuestro servidor se encuentren las librerias cors-filter-2.4.jar y java-property-utils-1.9.1.jar (Se encuentran en la carpeta lib/ del repositorio).

5.	Descargar Apache Tomcat: http://tomcat.apache.org/download-80.cgi 

6.	Descargar Phyton: https://www.python.org/downloads/release/python-2710/ 
