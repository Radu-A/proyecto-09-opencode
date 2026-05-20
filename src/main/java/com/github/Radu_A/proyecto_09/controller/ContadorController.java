package com.github.Radu_A.proyecto_09.controller;

import com.github.Radu_A.proyecto_09.service.IContadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContadorController {

	private final IContadorService contadorService;

	public ContadorController(IContadorService contadorService) {
		this.contadorService = contadorService;
	}

	@GetMapping("/contador")
	public String mostrar(Model model) {
		model.addAttribute("valor", contadorService.getValor());
		return "contador";
	}

	@GetMapping("/contador/incrementar")
	public String incrementar() {
		contadorService.incrementar();
		return "redirect:/contador";
	}

	@GetMapping("/contador/reiniciar")
	public String reiniciar() {
		contadorService.reiniciar();
		return "redirect:/contador";
	}
}
