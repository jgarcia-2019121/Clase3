/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jose.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garci
 */
// Excepción personalizada que se lanza cuando no se encuentra un producto en el inventario
class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada que se lanza cuando no hay suficiente cantidad en el inventario
// Se encadena con otra excepción que proporciona detalles adicionales sobre el error
class CantidadInsuficienteException extends Exception {
    public CantidadInsuficienteException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}

// Clase que representa un producto en el inventario
class Producto {
    private String nombre;
    private int cantidad;

    // Constructor para inicializar el nombre y la cantidad del producto
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Método que reduce la cantidad de un producto
    // Lanza una excepción si la cantidad solicitada es mayor que la disponible
    public void reducirCantidad(int cantidad) throws CantidadInsuficienteException {
        if (cantidad > this.cantidad) {
            // Lanza una excepción con un mensaje y la causa original (cantidad insuficiente)
            throw new CantidadInsuficienteException("Cantidad insuficiente en inventario.", new Exception("Cantidad solicitada: " + cantidad + ", Cantidad disponible: " + this.cantidad));
        }
        this.cantidad -= cantidad;
    }
}

// Clase que gestiona el inventario de productos
class Inventario {
    private List<Producto> productos;

    // Constructor que inicializa la lista de productos
    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    // Método que busca un producto en el inventario por nombre
    // Lanza una excepción si el producto no se encuentra
    public Producto buscarProducto(String nombre) throws ProductoNoEncontradoException {
        return productos.stream()
                .filter(producto -> producto.getNombre().equals(nombre))
                .findFirst()
                .orElseThrow(() -> new ProductoNoEncontradoException("Producto '" + nombre + "' no encontrado."));
    }

    // Método que realiza una venta de un producto, verificando que esté disponible
    // y que la cantidad solicitada sea válida
    public void realizarVenta(String nombre, int cantidad) throws ProductoNoEncontradoException, CantidadInsuficienteException {
        Producto producto = buscarProducto(nombre); // Busca el producto
        producto.reducirCantidad(cantidad); // Intenta reducir la cantidad del producto
        System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
    }
}

// Clase principal que ejecuta el programa
public class GestionInventario {

    public static void main(String[] args) {
        // Crea una lista de productos iniciales
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 10));
        productos.add(new Producto("Mouse", 25));

        Inventario inventario = new Inventario(productos); // Inicializa el inventario

        try {
            inventario.realizarVenta("Laptop", 1); // Intento de venta de un producto no existente
        } catch (ProductoNoEncontradoException | CantidadInsuficienteException e) {
            // Captura excepciones de producto no encontrado o cantidad insuficiente
            System.out.println("Error en la venta: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Causa original: " + e.getCause().getMessage());
            }
        }

        try {
            inventario.realizarVenta("Laptop", 15); // Intento de venta con cantidad insuficiente
        } catch (ProductoNoEncontradoException | CantidadInsuficienteException e) {
            System.out.println("Error en la venta: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Causa original: " + e.getCause().getMessage());
            }
        }
    }
}

