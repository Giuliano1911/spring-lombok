package it.epicode.spring_lombok.config;


import it.epicode.spring_lombok.entity.Topping;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Autowired
    private Faker faker;

    @Bean
    public Topping topping1() {
        return new Topping(
                faker.ancient().hero(),
                0.69,
                100
        );
    }

    @Bean
    public Topping topping2() {
        return new Topping(
                faker.animal().name(),
                0.90,
                200
        );
    }
}
