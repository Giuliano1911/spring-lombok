package it.epicode.spring_lombok.runner;

import it.epicode.spring_lombok.entity.Drink;
import it.epicode.spring_lombok.entity.Menu;
import it.epicode.spring_lombok.entity.Pizza;
import it.epicode.spring_lombok.entity.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    private Pizza pizza1;

    @Autowired
    private Pizza pizza2;

    @Autowired
    private Topping topping1;

    @Autowired
    private Topping topping2;

    @Autowired
    private Drink drink1;

    @Override
    public void run(String... args) {

        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizza1);
        pizzaList.add(pizza2);

        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(topping1);
        toppingList.add(topping2);

        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(drink1);

        Menu menu = new Menu("Menù del pranzo", pizzaList, drinkList, toppingList);

        System.out.println(menu.getName());
        System.out.println();
        System.out.println("Pizze");
        for (Pizza p : menu.getPizzaList())
            System.out.println(p);
        System.out.println();
        System.out.println("Toppings");
        for (Topping t : menu.getToppingList())
            System.out.println(t);
        System.out.println();
        System.out.println("Drinks");
        for (Drink d : menu.getDrinkList())
            System.out.println(d);
    }
}
