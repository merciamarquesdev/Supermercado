package com.example.mercado;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Mercado api", version = "1.0", description = "Mercado API"))
@EnableKafka
@EnableRabbit
public class MercadoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercadoApplication.class, args);
    }

}
