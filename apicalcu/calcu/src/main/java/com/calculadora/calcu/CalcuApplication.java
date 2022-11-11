package com.calculadora.calcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcuApplication {

	private static Logger logger = LoggerFactory.getLogger(CalcuApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CalcuApplication.class, args);

		logger.info("hola bb");

	}

}
