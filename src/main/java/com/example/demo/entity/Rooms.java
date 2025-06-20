package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Chiến lược tạo bảng riêng cho từng lớp con
@Table(name = "Rooms") // Bảng chung cho các loại phòng
@Getter
@Setter
@NoArgsConstructor

public class Rooms {
    @Id
    @Column(name = "RoomID")
    private String roomId;

    @Column(name = "RoomName", nullable = true, length = 255)
    private String roomName;

    @ManyToOne
    @JoinColumn(name = "EmployeeID", nullable = true, foreignKey = @ForeignKey(name = "FK_Room_Employee"))
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Staffs employee;

    @Column(name = "StartTime", nullable = true)
    private LocalDateTime startTime;

    @Column(name = "EndTime", nullable = true)
    private LocalDateTime endTime;

    @Column(name = "SlotQuantity", nullable = true)
    private Integer slotQuantity; // Số lượng slot

    @Column(name = "CreatedAt", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

}
