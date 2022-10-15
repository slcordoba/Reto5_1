//Categoria, Mensaje, Reservacion, Cliente , Cloud
//1.Modelo o Entidad
//2.Interface
//3.Repositorio
//4.Servicios
//5.Controlador o Web

// reportes status, fechas y clientes



package com.usa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.usa.modelo"})
public class g42Application {

	public static void main(String[] args) {
		SpringApplication.run(g42Application.class, args);
	}

}
