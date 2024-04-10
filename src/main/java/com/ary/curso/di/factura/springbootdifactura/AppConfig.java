package com.ary.curso.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.ary.curso.di.factura.springbootdifactura.models.Item;
import com.ary.curso.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara", 800);
        Product p2 = new Product("Teclado", 500);

        return Arrays.asList(
                new Item(p1, 2), new Item(p2, 4));

    }

    @Bean
   //@Primary
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Monitor", 1200);
        Product p2 = new Product("Teclado", 500);
        Product p3 = new Product("Impresora", 900);
        Product p4 = new Product("Escritorio", 600);

        return Arrays.asList(
                new Item(p1, 2),
                new Item(p2, 4),
                new Item(p3, 2),
                new Item(p4, 1));

    }

}
