package edu.fscj.cen3024c.pizzarestaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    public void displayAllPizzas() {
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza ID: " + pizza.getPizzaId() +
                    ", Flavor: " + pizza.getFlavor());
        }
    }
}
