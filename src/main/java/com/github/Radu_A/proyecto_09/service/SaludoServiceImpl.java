package com.github.Radu_A.proyecto_09.service;

import com.github.Radu_A.proyecto_09.model.Saludo;
import com.github.Radu_A.proyecto_09.repository.SaludoRepository;
import org.springframework.stereotype.Service;

@Service
public class SaludoServiceImpl implements ISaludoService {

	private final SaludoRepository saludoRepository;

	public SaludoServiceImpl(SaludoRepository saludoRepository) {
		this.saludoRepository = saludoRepository;
	}

	@Override
	public Saludo obtenerSaludo(String nombre) {
		Saludo existente = saludoRepository.findByNombre(nombre);
		if (existente != null) {
			return existente;
		}
		return generarSaludo(nombre);
	}

	@Override
	public Saludo generarSaludo(String nombre) {
		String nombreFinal = nombre != null ? nombre : "visitante";
		Saludo saludo = new Saludo(nombreFinal, "Hola, " + nombreFinal + "!");
		return saludoRepository.save(saludo);
	}
}
