package com.github.Radu_A.proyecto_09.repository;

import com.github.Radu_A.proyecto_09.model.Saludo;

public interface SaludoRepository {

	Saludo findByNombre(String nombre);

	Saludo save(Saludo saludo);
}
