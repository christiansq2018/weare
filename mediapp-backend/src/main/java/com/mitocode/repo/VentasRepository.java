package com.mitocode.repo;
import com.mitocode.model.Venta;

import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
