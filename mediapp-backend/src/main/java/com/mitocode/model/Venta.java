package com.mitocode.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private Set<ProductoVendido> productos;

    public Venta() {
       
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotal() {
        Float total = 0f;
        for (ProductoVendido productoVendido : this.productos) {
            total += productoVendido.getTotal();
        }
        return total;
    }

    public Set<ProductoVendido> getProductos() {
        return productos;
    }

    public void setProductos(Set<ProductoVendido> productos) {
        this.productos = productos;
    }
}
