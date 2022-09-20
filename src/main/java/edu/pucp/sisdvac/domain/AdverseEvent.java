package edu.pucp.sisdvac.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdverseEvent {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String patientCID;
    private String description;
    private Integer age;
    private char sex;
    private Double weight;
    private Double height;


    public AdverseEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientCID() {
        return patientCID;
    }

    public void setPatientCID(String patientCID) {
        this.patientCID = patientCID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
