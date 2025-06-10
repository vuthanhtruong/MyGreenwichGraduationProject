package com.example.demo.dto;

import java.time.LocalDate;

public class StudentsDTO {
    private String id;
    private String fullName;
    private String email;
    private String misId;
    private String campusName;
    private LocalDate createdDate;

    public StudentsDTO(String id, String fullName, String email, String misId,
                       String campusName, LocalDate createdDate) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.misId = misId;
        this.campusName = campusName;
        this.createdDate = createdDate;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMisId() { return misId; }
    public void setMisId(String misId) { this.misId = misId; }
    public String getCampusName() { return campusName; }
    public void setCampusName(String campusName) { this.campusName = campusName; }
    public LocalDate getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDate createdDate) { this.createdDate = createdDate; }
}