package com.bilgeadam;

import com.bilgeadam.controller.OgrenciController;

import com.bilgeadam.controller.OgretmenController;
import com.bilgeadam.controller.SinifController;
import com.bilgeadam.enums.EBrans;
import com.bilgeadam.repository.entity.KisiselBilgiler;
import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.repository.entity.Ogretmen;
import com.bilgeadam.repository.entity.Sinif;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        Session session = HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Ogretmen ogretmen = Ogretmen.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Zeynep")
//                        .soyisim("Seckinli")
//                        .tcKimlikNo("12345678912")
//                        .build())
//                .brans(EBrans.EDEBIYAT)
//                .iseBaslamaTarihi(LocalDate.of(2022,12,30))
//                .build();
//
//        Ogrenci ogrenci1 = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Elmas")
//                        .soyisim("Keskin")
//                        .tcKimlikNo("11223344556")
//                        .build())
//                .dogumTarihi(LocalDate.of(2000,01,01))
//                .build();
//        Ogrenci ogrenci2 = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Kazım")
//                        .soyisim("Kara")
//                        .tcKimlikNo("11122233344")
//                        .build())
//                .build();
//
//        session.save(ogrenci1);
//        session.save(ogrenci2);
//        session.save(ogretmen);
//
//        Sinif sinif = Sinif.builder()
//                .sinifAdi("JavaBoost11")
//                .ogretmenId(ogretmen.getId())
//                .ogrenciler(List.of(ogrenci1.getKisiselBilgiler().getIsim(),ogrenci2.getKisiselBilgiler().getIsim()))
//                .build();
//
//        session.save(sinif);
//
//        transaction.commit();
//        session.close();

        //OgrenciCriteria ogrenciCriteria = new OgrenciCriteria();
        //ogrenciCriteria.findAll();
        //ogrenciCriteria.findById(1L);

        //OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
        //ogretmenCriteria.findAll();
        //ogretmenCriteria.findById(1L);

        //SinifCriteria sinifCriteria = new SinifCriteria();
        //sinifCriteria.findAll();
        //sinifCriteria.findById(1L);

//        OgrenciDao ogrenciDao = new OgrenciDao();
//        List<Ogrenci> ogrenciList = ogrenciDao.findAll2();
//        //ogrenciList.stream().forEach(x-> System.out.println(x));
//        System.out.println(ogrenciDao.findById2(1L));
//        Session session = HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Ogrenci ogrenci = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Mehmet")
//                        .soyisim("Çetin")
//                        .tcKimlikNo("465789")
//                        .build())
//                .dogumTarihi(LocalDate.of(2000,5,13))
//                .build();
//
//        session.save(ogrenci);
//        transaction.commit();
//        session.close();



        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Zeynep")
                        .soyisim("Seckinli")
                        .tcKimlikNo("777")
                        .build())
                .dogumTarihi(LocalDate.of(1995,12,19))
                .build();
        OgrenciController ogrenciController = new OgrenciController();
        ogrenciController.save(ogrenci);

        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ramazan")
                        .soyisim("Demir")
                        .tcKimlikNo("111")
                        .build())
                .iseBaslamaTarihi(LocalDate.of(1945,1,1))
                .brans(EBrans.EDEBIYAT)
                .build();
        OgretmenController ogretmenController = new OgretmenController();
        ogretmenController.save(ogretmen);

        Sinif sinif = Sinif.builder()
                .sinifAdi("TELETABIES")
                .ogretmenId(1L)
                .ogrenciler(List.of(ogrenci.getKisiselBilgiler().getIsim()))
                .build();
        SinifController sinifController = new SinifController();
        sinifController.save(sinif);



    }
}