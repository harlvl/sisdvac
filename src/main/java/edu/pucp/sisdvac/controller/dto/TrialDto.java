package edu.pucp.sisdvac.controller.dto;

public class TrialDto {
    private Long id;
    private String title;
    private String numberINS;
    private char phase;
    private Long startDate;
    private Long endDate;

    public TrialDto() {
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
