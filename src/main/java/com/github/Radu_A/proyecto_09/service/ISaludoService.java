package com.github.Radu_A.proyecto_09.service;

import com.github.Radu_A.proyecto_09.model.Saludo;

public interface ISaludoService {

	Saludo obtenerSaludo(String nombre);

	Saludo generarSaludo(String nombre);
}
