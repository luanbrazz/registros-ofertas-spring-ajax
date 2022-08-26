package com.luan.registrospromocoes.domain.service;

import com.luan.registrospromocoes.domain.SocialMetaTag;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SocialMetaTagService {

    public SocialMetaTag getTwitterCardByUrl(String url){
        SocialMetaTag tag = new SocialMetaTag();
        try {
            Document doc = Jsoup.connect(url).get();
            tag.setTitle(doc.head().select("meta[name=twitter:title]").attr("content"));
            tag.setSite(doc.head().select("meta[name=twitter:site]").attr("content"));
            tag.setImage(doc.head().select("meta[name=twitter:image]").attr("content"));
            tag.setUrl(doc.head().select("meta[name=twitter:url]").attr("content"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tag;
    }



    public SocialMetaTag getOpenGraphByUrl(String url){
        SocialMetaTag tag = new SocialMetaTag();
        try {
            Document doc = Jsoup.connect(url).get();
            tag.setTitle(doc.head().select("meta[property=og:title]").attr("content"));
            tag.setSite(doc.head().select("meta[property=og:site_name]").attr("content"));
            tag.setImage(doc.head().select("meta[property=og:image]").attr("content"));
            tag.setUrl(doc.head().select("meta[property=og:url]").attr("content"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tag;
    }
}
