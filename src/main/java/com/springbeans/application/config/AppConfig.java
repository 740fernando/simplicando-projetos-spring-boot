package com.springbeans.application.config;

import com.springbeans.entities.Autor;
import com.springbeans.entities.Livro;
import com.springbeans.interfaces.AutorLivro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return  new Livro();
    }
    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
