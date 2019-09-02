package com.jgprogram.graphql;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "station")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PACKAGE)
class Station {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String firmwareVersion;
    @Column(nullable = false)
    private String countryIso;
    @Column(nullable = false)
    private String lcpName;
}
