package com.kevin.soto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kevin.soto.model.Producto;
import com.kevin.soto.service.IntProductoService;

@Controller
public class ProductoController {
    
    
    @Autowired
    private IntProductoService productoService;
    @GetMapping("/index")
    public String mostrarIndex(Model model) {
        for(Producto p:  productoService.obtenerTodos())
            System.out.println(p.getNombre());
        model.addAttribute("productos",productoService.obtenerTodos());
        return"listaProductos";
    }

 

}