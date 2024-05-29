package com.iudigital.supermercado.thread;

import com.iudigital.supermercado.domain.ClienteProducto;
import com.iudigital.supermercado.domain.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que simula el procesamiento de compras en un supermercado.
 */
public class CajeroProductoMain {
    
    public static void main(String[] args) {
        
        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        
        setProductos(productos);
        
        // Crear clientes con productos
        ClienteProducto cliente1 = new ClienteProducto("Tony Stark", productos);
        ClienteProducto cliente2 = new ClienteProducto("Superman", productos);
        ClienteProducto cliente3 = new ClienteProducto("Aquaman", productos);
        
        // Registrar el tiempo inicial
        long initialTime = System.currentTimeMillis();
        
        // Crear cajeros
        CajeroProducto cajero1 = new CajeroProducto("Valentina");
        CajeroProducto cajero2 = new CajeroProducto("Paola");
        CajeroProducto cajero3 = new CajeroProducto("Franchesca");
        
        
        // Procesar compras en hilos separados
        new Thread(() -> {
            cajero1.procesarCompra(cliente1, initialTime);
        }).start();
        new Thread(() -> {
            cajero2.procesarCompra(cliente2, initialTime);
        }).start();
        new Thread(() -> {
            cajero3.procesarCompra(cliente3, initialTime);
        }).start();
        
        
        /* Alternativamente, procesar compras en el hilo principal 
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
        cajero3.procesarCompra(cliente3, initialTime);
        */

    }
    
    /**
     * Inicializa la lista de productos con algunos ejemplos.
     *
     * @param productos La lista de productos a inicializar.
     */
    private static void setProductos(List<Producto> productos) {
        
        Producto producto1 = new Producto("Aceite", 18000, 4);
        Producto producto2 = new Producto("Arroz", 12000, 7);
        Producto producto3 = new Producto("Carne", 35000, 9);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
    }
}
