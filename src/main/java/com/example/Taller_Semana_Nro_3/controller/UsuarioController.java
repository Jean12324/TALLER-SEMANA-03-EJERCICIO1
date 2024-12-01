/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Taller_Semana_Nro_3.controller;

import com.example.Taller_Semana_Nro_3.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jeanc
 */
@Controller
public class UsuarioController {
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario()); 
        return "formulario"; 
    }

    @PostMapping("/guardar")
    public String guardarFormulario(Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario); 
        return "resultado"; 
    }
}
