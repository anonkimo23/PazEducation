package com.example.mvcsamalexiapro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mvcsamalexiapro.Entity.Usuario;
import com.example.mvcsamalexiapro.Service.UsuarioService;

@Controller
public class TablaController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario/tabla")
    public String mostrarTabla(Model model) {
        List<Usuario> usuarios = usuarioService.getUsuarios(); // Obtener la lista de usuarios desde el servicio
        model.addAttribute("usuarios", usuarios); // Pasar la lista de usuarios al modelo
        return "Tabla"; // Nombre del archivo HTML sin la extensión
    }
}
