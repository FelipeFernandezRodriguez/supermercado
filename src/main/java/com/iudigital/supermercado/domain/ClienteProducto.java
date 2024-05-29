package com.iudigital.supermercado.domain;

import java.util.List;

/**
 * Representa un cliente y los productos que ha comprado.
 */
public class ClienteProducto {

    /**
     * @param nombre El nombre del cliente.
     */
    private final String nombre;
    
    /**
     * @param productos La lista de productos adquiridos por el cliente.
     */
    private final List<Producto> productos;
 
    /**
     * Constructor
     */
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }
    
    /**
     * Getters
     */
    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

}