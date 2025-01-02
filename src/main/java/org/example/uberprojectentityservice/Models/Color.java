package org.example.uberprojectentityservice.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Color extends BaseModel{
    @Column(nullable = false, unique = true)
    private String name;

}
