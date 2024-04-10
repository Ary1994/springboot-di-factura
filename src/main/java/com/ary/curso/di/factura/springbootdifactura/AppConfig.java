package com.ary.curso.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ary.curso.di.factura.springbootdifactura.models.Item;
import com.ary.curso.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties",encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara", 800);
        Product p2 = new Product("Teclado", 500);

        return Arrays.asList(
                new Item(p1, 2), new Item(p2, 4));

    }

}