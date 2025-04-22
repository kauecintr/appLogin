package br.appLogin.appLogin.controller;

import br.appLogin.appLogin.model.usuarioModel;
import br.appLogin.appLogin.repository.usuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    @Autowired
    private usuarioRepository ur;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public String cadastroUsuario(@Valid usuarioModel usuario, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/cadastro";
        }

        ur.save(usuario);

        return "redirect:/login";
    }

}
