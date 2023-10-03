package com.bilgeadam.repository.entity;


import com.bilgeadam.enums.EBrans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="tbl_ogretmen")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ogretmen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    private EBrans brans;

    @Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslamaTarihi = LocalDate.now();

    @Embedded
    KisiselBilgiler kisiselBilgiler;


}
