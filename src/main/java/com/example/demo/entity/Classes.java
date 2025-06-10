package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @Column(name = "ClassID")
    private String classId;

    @Column(name = "NameClass", nullable = false)
    private String nameClass;

    @Column(name = "SlotQuantity")
    private Integer slotQuantity;

    @ManyToOne
    @JoinColumn(name = "SubjectID", nullable = false)
    private Subjects subject;

    @ManyToOne
    @JoinColumn(name = "Creator", nullable = false)
    private Staffs creator;

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    // Constructors
    public Classes() {
    }

    public Classes(String classId, String nameClass, Integer slotQuantity, Subjects subject, Staffs creator, LocalDateTime createdAt) {
        this.classId = classId;
        this.nameClass = nameClass;
        this.slotQuantity = slotQuantity;
        this.subject = subject;
        this.creator = creator;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Integer getSlotQuantity() {
        return slotQuantity;
    }

    public void setSlotQuantity(Integer slotQuantity) {
        this.slotQuantity = slotQuantity;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Staffs getCreator() {
        return creator;
    }

    public void setCreator(Staffs creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
