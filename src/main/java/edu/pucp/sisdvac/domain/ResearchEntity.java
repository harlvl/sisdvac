package edu.pucp.sisdvac.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResearchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String address;
    private String ruc;

    public ResearchEntity() {
    }

    public ResearchEntity(String type, String address, String ruc) {
        this.type = type;
        this.address = address;
        this.ruc = ruc;
    }

    public ResearchEntity(Long id, String type, String address, String ruc) {
        this.id = id;
        this.type = type;
        this.address = address;
        this.ruc = ruc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
