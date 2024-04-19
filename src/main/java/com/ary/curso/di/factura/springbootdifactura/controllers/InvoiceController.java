package com.ary.curso.di.factura.springbootdifactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ary.curso.di.factura.springbootdifactura.models.Client;
import com.ary.curso.di.factura.springbootdifactura.models.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        Invoice i =new Invoice();
        Client c=new Client();
        c.setLastname(invoice.getClient().getLastname());
        c.setName(invoice.getClient().getName());
        i.setClient(c);
        i.setDescription(invoice.getDescription());
        i.setItems(invoice.getItems());
        return i;
    }

}
