package com.example.mvcsamalexiapro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvcsamalexiapro.Entity.Rol;
import com.example.mvcsamalexiapro.Entity.Usuario;
import com.example.mvcsamalexiapro.Service.RolService;
import com.example.mvcsamalexiapro.Service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;

    @GetMapping("/usuario/nuevoUsuario")
    public String mostrarFormularioNuevoUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "nuevoUsuario";  
    }

    @PostMapping("/usuario/guardar")
    public String guardarUsuario(@Validated @ModelAttribute Usuario usuario, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<Rol> roles = rolService.getAllRoles();
            model.addAttribute("roles", roles);
            return "nuevoUsuario"; // Regresar al formulario si hay errores
        }
        try {
            usuarioService.saveOrUpdate(usuario);
            return "redirect:/usuario/tabla"; // Redirige a la tabla de usuarios después de guardar
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el error en los logs
            return "error"; // Asegúrate de tener una vista 'error.html' para manejar errores
        }
    }
}

