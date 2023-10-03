package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_sinif")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sinif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String sinifAdi;
    private Long ogretmenId;
    @ElementCollection
    List<String> ogrenciler;


}
