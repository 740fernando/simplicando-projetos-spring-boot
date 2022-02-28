package com.springbeans.application;

import com.springbeans.application.config.AppConfig;
import com.springbeans.entities.Autor;
import com.springbeans.entities.Livro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args){

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setCodigo("1234");
        livro.setNome("Senhor dos Anéis");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("teste teste");

        livro.exibir();

        ((AbstractApplicationContext)factory).close();
    }
}
