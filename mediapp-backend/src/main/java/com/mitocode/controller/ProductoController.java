package com.mitocode.controller;

import com.mitocode.exception.ModeloNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.model.Producto;
import com.mitocode.service.IProductoService;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar() throws Exception{
		List<Producto> lista = service.listar();
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Producto pac = service.listarPorId(id);
		
		if(pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		return new ResponseEntity<Producto>(pac, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@Valid @RequestBody Producto p) throws Exception{
		Producto pac = service.registrar(p);
		return new ResponseEntity<Producto>(pac, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Producto> modificar(@Valid @RequestBody Producto p) throws Exception{
		Producto pac = service.modificar(p);
		return new ResponseEntity<Producto>(pac, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Producto pac = service.listarPorId(id);
		if(pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
