package com.luan.registrospromocoes.domain.service;

import com.luan.registrospromocoes.domain.SocialMetaTag;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class SocialMetaTagService {

    public SocialMetaTag getOpenGraphByUrl(String url){
        SocialMetaTag tag = new SocialMetaTag();
        try {
            Document doc = Jsoup.connect(url).get();
            tag.setTitle(doc.head().select("meta[property=org:title]").attr("content"));
            tag.setSite(doc.head().select("meta[property=org:site_name]").attr("content"));
            tag.setImage(doc.head().select("meta[property=org:image]").attr("content"));
            tag.setUrl(doc.head().select("meta[property=org:url]").attr("content"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tag;
    }
}
