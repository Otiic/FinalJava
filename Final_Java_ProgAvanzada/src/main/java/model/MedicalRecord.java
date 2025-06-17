package model;

import java.time.LocalDate;

public class MedicalRecord {
    private int id;
    private int patientId;
    private String description;
    private LocalDate date;

    public MedicalRecord(int id, int patientId, String description, LocalDate date) {
        this.id = id;
        this.patientId = patientId;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
