package it.epicode.spring_lombok.config;


import it.epicode.spring_lombok.entity.Pizza;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Autowired
    private Faker faker;

    @Bean
    public Pizza pizza1() {
        return new Pizza(
                faker.app().author(),
                4.99,
                1000
        );
    }

    @Bean
    public Pizza pizza2() {
        return new Pizza(
                faker.name().firstName(),
                6.99,
                1200
        );
    }

}
