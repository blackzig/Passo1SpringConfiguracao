/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prefeiturarc.config;

import br.com.prefeiturarc.controller.RecebendoController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Michel
 */
@Configuration
@ComponentScan(basePackageClasses = {RecebendoController.class})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
    
}
