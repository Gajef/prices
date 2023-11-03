package es.kairos.prices.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Price {
    private int brandID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int priceList;
    private int productID;
    private int priority;
    private int price;
    private String curr;
    
}
