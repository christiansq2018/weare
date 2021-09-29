package com.mitocode.model;

import com.mitocode.model.Producto;

public class ProductoParaVender extends Producto {
    private Float cantidad;


    public void aumentarCantidad() {
        this.cantidad++;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public Float getTotal() {
        return this.getPrecio() * this.cantidad;
    }
}
