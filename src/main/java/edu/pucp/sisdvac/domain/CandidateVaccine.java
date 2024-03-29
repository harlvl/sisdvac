package edu.pucp.sisdvac.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_vaccine")
public class CandidateVaccine {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String code;
    private String description;
    private Double efficacy;
    private Double efficiency;
    private Double immunogenicity;
    private Double safety;

    @OneToOne(mappedBy = "candidate")
    private Trial trial;

    @OneToMany(fetch = FetchType.LAZY)
    private Collection<Dose> doses;
}
