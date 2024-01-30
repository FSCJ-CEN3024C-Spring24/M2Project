package edu.fscj.cen3024c.pizzarestaurant;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizzaId")
    private Long pizzaId;

    @Column(name = "flavor", nullable = false, length = 80)
    private String flavor;

    @Column(name = "createdAt", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    // Constructors, getters, and setters

    public Pizza() { }

    // Add all necessary constructors, getters, and setters here

    public Long getPizzaId() {
        return pizzaId;
    }

    public String getFlavor() {
        return flavor;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
