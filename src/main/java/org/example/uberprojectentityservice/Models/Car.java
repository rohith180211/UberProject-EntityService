package org.example.uberprojectentityservice.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.flogger.Flogger;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car extends BaseModel {
    @Column(nullable = false, unique = true)
    private String plateNumber;
    private String model;
    private String brand;
    @Enumerated(value=EnumType.STRING)
    private CarType cartype;
    @OneToOne
    private Driver driver;
    @ManyToOne
    private Color color;
}
