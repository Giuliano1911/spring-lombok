package it.epicode.spring_lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Menu {

    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
}
