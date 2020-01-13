package com.gizet.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name ="PET_TYPE_IS")
public class PetTypeEntity extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "petType")
    private Set<PetEntity> pets;

}
