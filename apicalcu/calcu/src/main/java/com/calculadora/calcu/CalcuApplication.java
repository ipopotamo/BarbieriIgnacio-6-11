package com.calculadora.calcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcuApplication {


	//ESTO ES UN TESTO DE COMO FUNCIONA UN LOGGER LAS CUENTAS ESTAN EN LA CLASE CUENTAS ABAJO DE CalcuApplication :)
	private static Logger logger = LoggerFactory.getLogger(CalcuApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CalcuApplication.class, args);

		logger.info("hola bb");

	}

}
