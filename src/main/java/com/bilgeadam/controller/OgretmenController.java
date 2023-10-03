package com.bilgeadam.controller;


import com.bilgeadam.repository.entity.Ogretmen;
import com.bilgeadam.service.OgretmenService;

import java.util.List;
import java.util.Optional;

public class OgretmenController {

    OgretmenService ogretmenService;

    public OgretmenController() {
        this.ogretmenService = new OgretmenService();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenService.save(ogretmen);
    }

    public void update(Ogretmen ogretmen){
        ogretmenService.update(ogretmen);
    }

    public List<Ogretmen> findAll(){
        return  ogretmenService.findAll();
    }

    public Optional<Ogretmen> findById(Long id){
        return ogretmenService.findById(id);
    }


}
