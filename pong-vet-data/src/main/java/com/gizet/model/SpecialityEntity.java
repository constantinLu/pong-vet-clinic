package com.gizet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="SPECIALITY")
public class SpecialityEntity extends BaseEntity {

    private String description;

    //@ManyToMany
   // private VetEntity vet;

}
