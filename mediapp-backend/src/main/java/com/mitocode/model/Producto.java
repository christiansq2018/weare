package com.mitocode.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "producto")
@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idProducto;
	
        
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name = "codigo", nullable = false, length = 10)
	private String codigo;
	
	@Column(name = "precio", nullable = false)
	private Float precio;
	
	@Column(name = "existencia", nullable = false)
	private Float existencia;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getExistencia() {
        return existencia;
    }

    public void setExistencia(Float existencia) {
        this.existencia = existencia;
    }
	
	
		
}
