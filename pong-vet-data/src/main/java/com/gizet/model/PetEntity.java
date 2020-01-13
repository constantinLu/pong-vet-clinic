package com.gizet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/*
Object
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PET")
public class PetEntity extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetTypeEntity petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OwnerEntity owner;

    private LocalDate birthDate;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<VisitEntity> visits = new HashSet<>();

}
