package com.springframework.petclinicspring.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {
    @Builder
    public Owner(Long id, String firstName, String lastName, String adresse, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.adresse = adresse;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    @Column(name = "adresse")
    private String adresse;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
}
