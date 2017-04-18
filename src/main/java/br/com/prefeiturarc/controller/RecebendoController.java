/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prefeiturarc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Michel
 */
@Controller
public class RecebendoController {

    @RequestMapping("/recebendo/novo")
    public String novo() {
        return "recebendo/CadastroRecebendo";
    }

}
