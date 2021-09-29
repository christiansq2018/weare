package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Producto;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, Integer>{
	Producto findFirstByCodigo(String codigo);
}
