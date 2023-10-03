package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.MyFactoryRepository;


public class OgrenciRepository extends MyFactoryRepository<Ogrenci, Long> {

    public OgrenciRepository() {
        super(new Ogrenci());
    }

}
