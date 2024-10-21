package com.bibliotecaAtv.biblioteca.config;

import com.bibliotecaAtv.biblioteca.service.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void initDB(){
        this.dbService.initDB();
    }
}