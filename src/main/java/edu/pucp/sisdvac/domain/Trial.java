package edu.pucp.sisdvac.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Trial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String numberINS;
    private char phase;
    private Long startDate;
    private Long endDate;
    @OneToOne(cascade = CascadeType.ALL)
    private CandidateVaccine candidate;
    @OneToOne(cascade = CascadeType.ALL)
    private TrialStatus status;
    @OneToMany(fetch = FetchType.LAZY)
    private Collection<Advance> advances;

    public Trial() {
    }

    public Collection<Advance> getAdvances() {
        return advances;
    }

    public void setAdvances(Collection<Advance> advances) {
        this.advances = advances;
    }

    public CandidateVaccine getCandidate() {
        return candidate;
    }

    public void setCandidate(CandidateVaccine candidate) {
        this.candidate = candidate;
    }

    public TrialStatus getStatus() {
        return status;
    }

    public void setStatus(TrialStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumberINS() {
        return numberINS;
    }

    public void setNumberINS(String numberINS) {
        this.numberINS = numberINS;
    }

    public char getPhase() {
        return phase;
    }

    public void setPhase(char phase) {
        this.phase = phase;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }
}
