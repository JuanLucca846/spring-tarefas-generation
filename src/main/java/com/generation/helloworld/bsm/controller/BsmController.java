package com.generation.helloworld.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "Orientação ao Futuro<br> Responsabilidade Pessoal<br> "
				+ "Mentalidade de Crescimento<br> Persistência<br>" + "Trabalho Em Equipe<br> Orientação ao Detalhe<br>"
				+ "Proatividade<br> Comunicação<br>";
	}
}
