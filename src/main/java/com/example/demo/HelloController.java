package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable String num1, @PathVariable String num2) {
        // Converte os parâmetros de String para int
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        
        // Realiza a soma
        int resultado = numero1 + numero2;
        
        // Retorna a mensagem no formato especificado
        return "O resultado da soma de " + numero1 + " + " + numero2 + " é " + resultado;
    }
} 