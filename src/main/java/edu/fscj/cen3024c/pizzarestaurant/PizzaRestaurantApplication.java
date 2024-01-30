package edu.fscj.cen3024c.pizzarestaurant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// PizzaRepository provides the data access layer,
// PizzaService provides the business logic, and
// PizzaController handles the presentation logic.
// The displayAllPizzas() method is called from the
// application's main class to display the pizzas.

@SpringBootApplication
public class PizzaRestaurantApplication implements CommandLineRunner {
	private final PizzaController pizzaController;

	public PizzaRestaurantApplication(PizzaController pizzaController) {
		this.pizzaController = pizzaController;
	}

	public static void main(String[] args) {

		SpringApplication.run(PizzaRestaurantApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Call the displayAllPizzas method from the PizzaController
		pizzaController.displayAllPizzas();
	}
}