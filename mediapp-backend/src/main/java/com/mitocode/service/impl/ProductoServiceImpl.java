package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Producto;
import com.mitocode.repo.IProductoRepo;
import com.mitocode.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public Producto registrar(Producto pac) {
		return repo.save(pac);
	}

	@Override
	public Producto modificar(Producto pac) {
		return repo.save(pac);
	}

	@Override
	public List<Producto> listar() {
		return repo.findAll();
	}

	@Override
	public Producto listarPorId(Integer id) {		
		Optional<Producto> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Producto();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	


}
