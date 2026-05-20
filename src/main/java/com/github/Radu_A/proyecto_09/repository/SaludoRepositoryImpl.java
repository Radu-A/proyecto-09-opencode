package com.github.Radu_A.proyecto_09.repository;

import com.github.Radu_A.proyecto_09.model.Saludo;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class SaludoRepositoryImpl implements SaludoRepository {

	private final Map<String, Saludo> store = new ConcurrentHashMap<>();

	@Override
	public Saludo findByNombre(String nombre) {
		return store.get(nombre);
	}

	@Override
	public Saludo save(Saludo saludo) {
		store.put(saludo.getNombre(), saludo);
		return saludo;
	}
}
