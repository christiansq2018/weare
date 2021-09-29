package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Producto;

public interface IProductoService {

	Producto registrar(Producto pac);
	Producto modificar(Producto pac);
	List<Producto> listar();
	Producto listarPorId(Integer id);
	void eliminar(Integer id);
}
