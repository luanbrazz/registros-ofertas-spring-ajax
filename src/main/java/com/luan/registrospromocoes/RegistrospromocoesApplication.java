package com.luan.registrospromocoes;

import com.luan.registrospromocoes.domain.service.SocialMetaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrospromocoesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RegistrospromocoesApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {

	}
}
