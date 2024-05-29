package com.iudigital.supermercado.thread;

import com.iudigital.supermercado.domain.ClienteProducto;
import com.iudigital.supermercado.domain.Producto;

public class CajeroProducto {

    private String nombreCajero;

    public CajeroProducto(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public void procesarCompra(ClienteProducto cliente, long timeStanp) {
        System.out.println("Cajeo " + this.nombreCajero + " comienza a procesar la compra del cliente "
                + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - timeStanp) / 1000
                + " seg "
                + "\n\n-------------------------------------------------------\n");
        int contCliente = 1;

        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println("Cajero: " + this.nombreCajero
                    + "\nProcesando el producto: " + contCliente
                    + "\nNombre del producto: " + producto.getNombre()
                    + "\nPrecio producto: " + producto.getPrecio()
                    + "\nCantidad de productos: " + producto.getCantidad()
                    + "\nCosto total del producto: " + producto.getCantidad() * producto.getPrecio()
                    + "\n-> Tiempo: " + (System.currentTimeMillis() - timeStanp) / 1000 + " seg "
                    + "\n\n-------------------------------------------------------\n");
            contCliente++;                   
        }
        System.out.println("Cajero " + this.nombreCajero + " ha terminado de procesar la compra del cliente " + cliente.getNombre()
                + " en el tiempo " + (System.currentTimeMillis() - timeStanp) / 1000 + " seg "
                + "\n\n-------------------------------------------------------\n");
    }

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
