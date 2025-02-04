package it.epicode.spring_lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private String name;
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
}
