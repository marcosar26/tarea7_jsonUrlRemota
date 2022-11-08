package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            URL url = new URL("https://dummyjson.com/products");

            Obj productos = mapper.readValue(url, Obj.class);

            for (Producto product : productos.getProducts()) {
                System.out.println(product);
            }

        } catch (MalformedURLException e) {
            System.out.println("La URL es inválida");
        } catch (IOException e) {
            System.out.println("Error al parsear el JSON");
        }
    }
}