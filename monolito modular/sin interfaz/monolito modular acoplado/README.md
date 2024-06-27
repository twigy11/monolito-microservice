# Proyecto Monolítico 🏗️

Este es un proyecto monolítico con dependencias entre los diferentes modulos

## Descripción técnica del proyecto

- Proyecto Java con Maven que pretende simular un monolito con acoplamientos entre los diferentes dominos:
    
    - **User**: Dominio para la gestión de los usuarios
    - **Product**: Dominio para la gestión de los productos
    - **Payment**: Dominio para la gestión de los pagos
    - **Order**: Dominio para la gestión de los pedidos

- Cada **módulo** tiene las siguientes **capas**:

    - **Capa Rest**: El controlador
    - **Capa Aplicación**: El servicio
    - **Capa de Acceso al dato**: 
        - El repository
        - La entidad
- La aplicación se **arranca** en el modulo **main application**
- La **configuración de la base de datos** es para una base de datos **H2 configurada para memoria (no persistente)**, que nos va a permitir simular la persistencia con el ORM sin necesidad de infraestructura

- El **ORM** es **Hibernate 5.6.9.Final**

- El **Servidor de Aplicaciones** es **Apache Tomcat/9.0.64**

- El framework de desarrollo **Spring Boot 2.7.1**

- Los servicios estdán documentado con **openapi 3** y se visualizaon con **swagger** 


## Requisitos

- Tener la [jdk 11](https://adoptopenjdk.net/releases.html?variant=openjdk11&jvmVariant=openj9) o superior instalada 
- Tener instalado maven versión [3.8.6](https://maven.apache.org/download.cgi#Installation) o superior instalado

## Instalación 💻

- Ejecución del comando de compilación del proyecto
    ```bash 
    mvn clean install 
    ```

## Uso 🛠️
- Ejecución del comando de arranque del servidor del proyecti
     ```bash 
     mvn --projects main-application spring-boot:run
    ```
- Al arrancar se disponen de las siguientes aplicaciones:

    - **H2 Console**: http://localhost:8080/h2-console
    - **OpenApi Doc**:  http://localhost:8080/api-docs
    - **OpenApi UI (Swagger)**  http://localhost:8080/swagger-ui.html
    - **Servicios**
        
        - **Order**: http://localhost:8080/order
        - **Product**:  http://localhost:8080/product
        - **Payment**:  http://localhost:8080/payment
        - **User**:  http://localhost:8080/user
