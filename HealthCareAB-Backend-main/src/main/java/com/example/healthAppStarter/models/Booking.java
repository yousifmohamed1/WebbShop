package com.example.healthAppStarter.models;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class Booking {
    @Id
    private String id;

    @NotBlank
    private String userId;

    @NotBlank
    private String adminId;

    @NotBlank
    @Size(max = 300)
    private String description;

    @NotBlank
    private LocalDateTime bookingStart;

    @NotBlank
    private LocalDateTime bookingEnd;

    public Booking(String id, String userId, String adminId, String description, LocalDateTime bookingStart, LocalDateTime bookingEnd) {
        this.id = id;
        this.userId = userId;
        this.adminId = adminId;
        this.description = description;
        this.bookingStart = bookingStart;
        this.bookingEnd = bookingEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(LocalDateTime bookingStart) {
        this.bookingStart = bookingStart;
    }

    public LocalDateTime getBookingEnd() {
        return bookingEnd;
    }

    public void setBookingEnd(LocalDateTime bookingEnd) {
        this.bookingEnd = bookingEnd;
    }
}
