package com.gizet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "VISITS")
public class VisitEntity extends BaseEntity {

    private LocalDateTime date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetEntity pet;

}
