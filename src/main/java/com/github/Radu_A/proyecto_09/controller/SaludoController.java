package com.github.Radu_A.proyecto_09.controller;

import com.github.Radu_A.proyecto_09.model.Saludo;
import com.github.Radu_A.proyecto_09.service.ISaludoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {

	private final ISaludoService saludoService;

	public SaludoController(ISaludoService saludoService) {
		this.saludoService = saludoService;
	}

	@GetMapping("/saludo/{nombre}")
	public String saludoPath(@PathVariable String nombre, Model model) {
		Saludo saludo = saludoService.obtenerSaludo(nombre);
		model.addAttribute("nombre", saludo.getNombre());
		return "saludo";
	}

	@GetMapping("/saludo")
	public String saludoParam(@RequestParam(required = false) String nombre, Model model) {
		Saludo saludo = saludoService.generarSaludo(nombre);
		model.addAttribute("nombre", saludo.getNombre());
		return "saludo";
	}

}
