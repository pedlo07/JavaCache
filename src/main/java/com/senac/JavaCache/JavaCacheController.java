package com.senac.JavaCache;

import com.senac.JavaCache.JavaCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaCacheController {
    public final JavaCacheService javaCacheService;

    @Autowired
    public JavaCacheController(JavaCacheService javaCacheService){
        this.javaCacheService = javaCacheService;
    }
    //teste
    @GetMapping("/getCacheValor")
        public String getCacheValor(@RequestParam String valor){
            return javaCacheService.getvalor(valor);
        }

    @PostMapping("/limparCache")
        public void clearCache(){
    }
}