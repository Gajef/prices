package es.kairos.prices.infrastructure.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class PriceEntity {
    private int brandID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int priceList;
    private int productID;
    private int priority;
    private int price;
    private String curr;
}
