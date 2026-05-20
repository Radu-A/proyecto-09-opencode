package com.github.Radu_A.proyecto_09.controller;

import com.github.Radu_A.proyecto_09.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class AnimalController {

	private final List<Animal> animales = Arrays.asList(
			new Animal("León", "mamífero", "Gran felino que habita en las sabanas de África"),
			new Animal("Águila real", "ave", "Ave rapaz de gran envergadura y vista aguda"),
			new Animal("Iguana verde", "reptil", "Reptil arbóreo de zonas tropicales americanas"),
			new Animal("Delfín", "mamífero", "Mamífero marino conocido por su inteligencia"),
			new Animal("Tucán", "ave", "Ave tropical reconocida por su pico colorido")
	);

	@GetMapping("/animales")
	public String listarAnimales(@RequestParam(required = false) String tipo, Model model) {
		List<Animal> resultado = (tipo != null && !tipo.isBlank())
				? animales.stream()
					.filter(a -> a.getTipo().equalsIgnoreCase(tipo))
					.collect(Collectors.toList())
				: animales;
		model.addAttribute("animales", resultado);
		model.addAttribute("tipoSeleccionado", tipo);
		return "animales";
	}

}
