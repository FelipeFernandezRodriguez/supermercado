package com.iudigital.supermercado.domain;

/**
 * Representa un producto en el supermercado.
 */
public class Producto {

    /**
     * * @param nombre El nombre del producto.
     */
    private String nombre;
    
    /**
     * @param precio El precio unitario del producto.
     */
    private float precio;
    
    /**
     * @param cantidad La cantidad de productos adquiridos.
     */
    private int cantidad;

    /**
     * Constructor
    */
    public Producto(String nombre, float precio, int cantidad) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
