# Spring_JPA_Intro

Introduccion a la gestión de la persistencia a traves de Spring JPA.

Para este ejemplo utilizamos un DTO muy similar al que se utilizará en el proyecto final.

Se presenta en esta introducción:

* Separación de código para aportar una arquitectura limpia dividida en capas y entidades principales de negocio

* Creación de un proyecto SpringWeb con las dependencias mínimas necesarias para una gestión básica

* Conexión a la capa de persistencia a través de application.properties en /resources

* Uso de consultas existentes por defecto, consultas de modificacion y consultas personalizadas

* Casos particulares donde los nombres de los atributos de las entidades Java no coincidan con los campos de las tablas en la persistencia (en este caso particular, MySQL)

* Ejemplos en /resources/static de unos fragmentos de código sql para la creación y consultas de tablas básicas

Queda aun pendiente, el desacoplamiento con la capa JPA y la integración completa en el proyecto, con la gestión de los DTO's y los servicios Rest
