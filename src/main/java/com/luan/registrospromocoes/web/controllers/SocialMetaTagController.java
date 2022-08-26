package com.luan.registrospromocoes.web.controllers;

import com.luan.registrospromocoes.domain.SocialMetaTag;
import com.luan.registrospromocoes.domain.service.SocialMetaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/meta")
public class SocialMetaTagController {

    @Autowired
    private SocialMetaTagService service;

    @PostMapping("/info")
    public ResponseEntity<SocialMetaTag> getDadosViaUrl(@RequestParam("url") String url){

        SocialMetaTag socialMetaTag =service.getSocialMetaTagByUrl(url);
        return  socialMetaTag != null ?
                ResponseEntity.ok(socialMetaTag) : ResponseEntity.notFound().build();
    }
}
