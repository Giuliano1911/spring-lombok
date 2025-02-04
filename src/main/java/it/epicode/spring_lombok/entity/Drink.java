package it.epicode.spring_lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink {

    private String name;
    private Double price;
    private Integer calories;
}
