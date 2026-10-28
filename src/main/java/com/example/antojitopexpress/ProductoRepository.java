package com.example.antojitopexpress;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    private final List<Producto> productos = new ArrayList<>();

    public ProductoRepository() {

        productos.add(new Producto(
                "1", "Hamburguesa", "Comida rápida", 15000, 20));

        productos.add(new Producto(
                "2", "Perro caliente", "Comida rápida", 10000, 15));

        productos.add(new Producto(
                "3", "Arepa con queso", "Comida rápida", 5000, 25));

        productos.add(new Producto(
                "4", "Dedos de queso", "Pasabocas", 6000, 20));

        productos.add(new Producto(
                "5", "Empanadas", "Pasabocas", 3000, 30));
    }

    public List<Producto> findAll() {
        return productos;
    }

    public Producto findById(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public Producto save(Producto producto) {
        productos.add(producto);
        return producto;
    }
}