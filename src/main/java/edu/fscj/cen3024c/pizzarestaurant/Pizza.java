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

    @Column(name = "size", length = 40)
    private String size;

    @Column(name = "price", nullable = false, precision = 5, scale = 2)
    private BigDecimal price;

    @Column(name = "createdAt", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

    // Constructors, getters, and setters

    public Pizza() { }

    // Add all necessary constructors, getters, and setters here

    public Long getPizzaId() {
        return pizzaId;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
