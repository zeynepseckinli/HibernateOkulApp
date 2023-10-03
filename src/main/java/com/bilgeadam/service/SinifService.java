package com.bilgeadam.service;


import com.bilgeadam.repository.SinifRepository;
import com.bilgeadam.repository.entity.Sinif;

import java.util.List;
import java.util.Optional;

public class SinifService {

    SinifRepository sinifRepository;

    public SinifService() {
        this.sinifRepository = new SinifRepository();
    }

    public Sinif save(Sinif sinif){
        return sinifRepository.save(sinif);
    }

    public void update(Sinif sinif){
        sinifRepository.update(sinif);
    }

    public List<Sinif> findAll(){
        return sinifRepository.findAll();
    }

    public Optional<Sinif> findById(Long id){
        return sinifRepository.findById(id);
    }

}
