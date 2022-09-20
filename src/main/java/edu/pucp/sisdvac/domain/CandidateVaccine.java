package edu.pucp.sisdvac.domain;

import javax.persistence.*;

@Entity
public class CandidateVaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String code;
    private String description;
    private Double efficacy;
    private Double efficiency;
    private Double immunogenicity;
    private Double safety;
    @OneToOne(mappedBy = "candidate")
    private Trial trial;

    public CandidateVaccine() {
    }

    public Trial getTrial() {
        return trial;
    }

    public void setTrial(Trial trial) {
        this.trial = trial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(Double efficacy) {
        this.efficacy = efficacy;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    public Double getImmunogenicity() {
        return immunogenicity;
    }

    public void setImmunogenicity(Double immunogenicity) {
        this.immunogenicity = immunogenicity;
    }

    public Double getSafety() {
        return safety;
    }

    public void setSafety(Double safety) {
        this.safety = safety;
    }
}
