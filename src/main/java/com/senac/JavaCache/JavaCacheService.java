package com.senac.JavaCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class JavaCacheService {

    @Cacheable(value = "teste", key = "#valor")
    public String getvalor(String valor){
        return "Retorno é: " + valor;
    }

    @CacheEvict(value = "teste", allEntries = true)
    public void limpaCache(){

    }

}
