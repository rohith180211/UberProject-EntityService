package org.example.uberprojectentityservice.Models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OTP extends BaseModel{
    private String code;
    private String sentToNumber;
    public static OTP make(String phoneNumber){
        Random random = new Random();
        int code = random.nextInt(9000)+1000;
        return OTP.builder().sentToNumber(phoneNumber).code(Integer.toString(code)).build();
    }
}
