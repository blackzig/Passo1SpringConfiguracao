/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prefeiturarc.controller;

import br.com.prefeiturarc.model.Recebendo;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Michel
 */
@Controller
public class RecebendoController {

    @RequestMapping("/recebendo/novo")
    public String novo(Recebendo recebendo) {
        return "recebendo/CadastroRecebendo";
    }

    @RequestMapping(value = "/recebendo/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Recebendo recebendo, BindingResult bindingResult, Model model, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return novo(recebendo);
        }
        attributes.addFlashAttribute("mensagem", "Salvo com sucesso");
        return "redirect:/recebendo/novo";
    }

    @RequestMapping("/teste")
    public String teste(Recebendo recebendo) {
        return "Teste";
    }

}
