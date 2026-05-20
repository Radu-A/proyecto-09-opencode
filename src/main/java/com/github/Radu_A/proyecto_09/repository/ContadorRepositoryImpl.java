package com.github.Radu_A.proyecto_09.repository;

import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ContadorRepositoryImpl implements ContadorRepository {

	private final AtomicInteger contador = new AtomicInteger(0);

	@Override
	public int getValor() {
		return contador.get();
	}

	@Override
	public int incrementar() {
		return contador.incrementAndGet();
	}

	@Override
	public void reiniciar() {
		contador.set(0);
	}
}
