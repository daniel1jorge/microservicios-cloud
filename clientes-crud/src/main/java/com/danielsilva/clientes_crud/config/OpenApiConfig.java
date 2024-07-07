package com.danielsilva.clientes_crud.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Client Crud", version = "0.0.1", description = "Corresponde a api de crud clientes prueba."))
public class OpenApiConfig {
}
