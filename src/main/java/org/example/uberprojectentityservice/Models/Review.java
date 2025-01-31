package org.example.uberprojectentityservice.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)

public class Review extends BaseModel {

    @Column(nullable = false)
    private String content;

    private Double rating;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    @JsonIgnore
    private Booking booking; // we have defined a 1:1 relationship between booking and review

    @Override
    public String toString() {
        return "Review: " + this.content + " " + this.rating + " " + " booking: " + this.booking.getId() + " " + this.createdAt;
    }

}

// new Review(content, rating);