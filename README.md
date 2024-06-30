# microservicios-cloud

# Orquestado de Microservicios con spring cloud 

## _Este proyecto estare demostrando lo aprendido en el curso realizado de udemy._

_en este repo se almacena un ejemplo de una arquitectura basada en microservicios construida con Spring Cloud. El proyecto incluye una API REST para la gestión de clientes (ABM), integrada con varios componentes de Spring Cloud como Eureka Server, Config Server, Gateway, OpenFeign, Circuit Breaker, y más. Además, demuestra seguridad con OAuth2 y JWT, y trazabilidad distribuida con Zipkin y OpenTelemetry._

## Requisitos
 - Java 17
 - Docker
 - Maven
 - MySQL

## Arquitectura
_La arquitectura consiste en los siguientes componentes:_

- **Servicio de Clientes**: Gestiona los datos de los clientes (operaciones ABM).
- **Eureka Server**: Registro de servicios para descubrimiento de servicios.
- **Config Server**: Gestión centralizada de configuraciones.
- **API Gateway**: Punto de entrada único para todos los microservicios, maneja el enrutamiento.
- **OpenFeign**: Cliente REST declarativo para la comunicación entre servicios.
- **Circuit Breaker**: Proporciona resiliencia y tolerancia a fallos.
- **Spring Cloud Stream**: Microservicios dirigidos por mensajes con Kafka.
- **Seguridad**: OAuth2 y JWT para asegurar los endpoints.
- **Trazabilidad Distribuida**: Zipkin y OpenTelemetry para trazar solicitudes.

```
git clone https://github.com/daniel1jorge/microservicios-cloud.git
cd microservicios-cloud
```