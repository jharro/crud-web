package com.example.crudweb.controlador;

import com.example.crudweb.respositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("")
    public String home(){
        return "index";
    }//http://localhost:8080/

    @GetMapping("/productos")//http://localhost:8080/productos
    public String productos(Model model){
        model.addAttribute("productos",productoRepositorio.findAll());
     //   model.addAttribute("productos",productoRepositorio.findAll());
        return "productos";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
