package com.github.Radu_A.proyecto_09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DadoController {

	@GetMapping("/dado")
	public String dado(@RequestParam(defaultValue = "6") int caras, Model model) {
		int numero = (int) (Math.random() * caras) + 1;
		model.addAttribute("numero", numero);
		model.addAttribute("caras", caras);
		return "dado";
	}

}
