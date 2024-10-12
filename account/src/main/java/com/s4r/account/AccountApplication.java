package com.s4r.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Bank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Saidur Rahman",
                        email = "saidur.r4n@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank Accounts microservice REST API Documentation"
        )
)
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
