package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Sinif;
import com.bilgeadam.utility.MyFactoryRepository;


public class SinifRepository extends MyFactoryRepository<Sinif, Long> {

    public SinifRepository(){
        super(new Sinif());
    }

}
