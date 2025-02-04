package it.epicode.spring_lombok.config;


import it.epicode.spring_lombok.entity.Drink;
import com.github.javafaker.Faker;
import it.epicode.spring_lombok.entity.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Autowired
    private Faker faker;

    @Bean
    public Drink drink1() {
        return new Drink(
                faker.backToTheFuture().quote(),
                0.69,
                100
        );
    }
}
