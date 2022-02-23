package com.clinica.sgt.controllers;

import com.clinica.sgt.entidades.Usuario;
import com.clinica.sgt.servicios.UsuarioServicio;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
public class indexController {

	@Autowired
	UsuarioServicio usuarioServicio;

	@GetMapping("/")
    public String index() {      
        return "index.html";
   
	}
	
	@PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, ModelMap modelo) {
        
        try {
    		
       		return "exito.html";
 
	   } catch(Exception e/*error*/) {
			e.printStackTrace();
		    return "error.html";
	}
        
  }
}
