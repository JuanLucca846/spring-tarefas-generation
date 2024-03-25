package com.generation.helloworld.melhorias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/melhorias")
public class MelhoriasController {

	@GetMapping
	public String melhorias() {
		return "Desejo aprimorar os meus conhecimento em backend e no framework <strong>Spring</strong>";
	}
}
