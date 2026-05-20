package com.github.Radu_A.proyecto_09.service;

import com.github.Radu_A.proyecto_09.repository.ContadorRepository;
import org.springframework.stereotype.Service;

@Service
public class ContadorServiceImpl implements IContadorService {

	private final ContadorRepository contadorRepository;

	public ContadorServiceImpl(ContadorRepository contadorRepository) {
		this.contadorRepository = contadorRepository;
	}

	@Override
	public int getValor() {
		return contadorRepository.getValor();
	}

	@Override
	public int incrementar() {
		return contadorRepository.incrementar();
	}

	@Override
	public void reiniciar() {
		contadorRepository.reiniciar();
	}
}
