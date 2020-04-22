package com.example.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class pet {
    private Long id;
    private String petType;
    private String petName;
    private String gender;
    private double price;

}
