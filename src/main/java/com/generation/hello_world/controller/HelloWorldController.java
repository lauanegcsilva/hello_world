package com.generation.hello_world.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping()
	public class HelloWorldController {

		@GetMapping("/hello")
		public String helloworld() {
			return "Hello World!";
		}

		@GetMapping("/bsms")
		public List<String> bsms() {
			return Arrays.asList("Responsabilidade Pessoal", "Persistência", "Mentalidade de Crescimento",
					"Orientação ao Futuro");
		}

		@GetMapping("/objetivos")
		public List<String> objetivos() {
			return Arrays.asList("Prestar mais atenção ao detalhe", "Estudar por fora o que não entendi de java");
		}

	}
