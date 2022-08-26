package com.luan.registrospromocoes;

import com.luan.registrospromocoes.domain.SocialMetaTag;
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

		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.pichau.com.br/monitor-profissional-pichau-perseus-pro-27-pol-ips-qhd-100-srgb-10bits-delta-2-rec-709-base-ajustavel-hdmi-dp-pc-prs27-mpp01");
		System.out.println(tag.toString());
	}
}
