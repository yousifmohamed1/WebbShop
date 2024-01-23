package com.example.healthAppStarter.models;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class Feedback {

    @Id
    private String id;

    @NotBlank
    @Size(max = 300)
    private String description;

    @NotBlank
    private int stars;

    @NotBlank
    private LocalDateTime reviewDate = LocalDateTime.now();

    public Feedback(String id, String description, int stars, LocalDateTime reviewDate) {
        this.id = id;
        this.description = description;
        this.stars = stars;
        this.reviewDate = reviewDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }
}
