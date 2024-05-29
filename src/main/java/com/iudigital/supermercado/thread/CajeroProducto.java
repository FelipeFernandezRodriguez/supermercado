package com.iudigital.supermercado.thread;

import com.iudigital.supermercado.domain.ClienteProducto;
import com.iudigital.supermercado.domain.Producto;

/**
 * Representa un cajero que procesa compras de clientes en un supermercado.
 */
public class CajeroProducto {

    /**
     * @param nombreCajero El nombre del cajero.
     */
    private String nombreCajero;

    /**
     * Constructor
    */
    public CajeroProducto(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    /**
     * Procesa la compra de un cliente, mostrando información detallada.
    */
    public void procesarCompra(ClienteProducto cliente, long timeStanp) {
        System.out.println("\nCajero " + this.nombreCajero + " comienza a procesar la compra del cliente "
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

    /**
     * Espera un segundo (1000 milisegundos).
     */
    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
