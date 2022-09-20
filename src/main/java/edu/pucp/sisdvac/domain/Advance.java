package edu.pucp.sisdvac.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Advance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subjectsCompleted;
    private String subjectsAbandoned;
    private String subjectsFailed;
    private Integer males;
    private Integer females;
    private Integer minAge;
    private Integer maxAge;
    private Long startDate;
    private Long endDate;

    @OneToMany(fetch = FetchType.LAZY)
    private Collection<AdverseEvent> adverseEvents;

    public Advance() {
    }

    public Collection<AdverseEvent> getAdverseEvents() {
        return adverseEvents;
    }

    public void setAdverseEvents(Collection<AdverseEvent> adverseEvents) {
        this.adverseEvents = adverseEvents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectsCompleted() {
        return subjectsCompleted;
    }

    public void setSubjectsCompleted(String subjectsCompleted) {
        this.subjectsCompleted = subjectsCompleted;
    }

    public String getSubjectsAbandoned() {
        return subjectsAbandoned;
    }

    public void setSubjectsAbandoned(String subjectsAbandoned) {
        this.subjectsAbandoned = subjectsAbandoned;
    }

    public String getSubjectsFailed() {
        return subjectsFailed;
    }

    public void setSubjectsFailed(String subjectsFailed) {
        this.subjectsFailed = subjectsFailed;
    }

    public Integer getMales() {
        return males;
    }

    public void setMales(Integer males) {
        this.males = males;
    }

    public Integer getFemales() {
        return females;
    }

    public void setFemales(Integer females) {
        this.females = females;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
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
