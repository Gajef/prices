package es.kairos.prices.application;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class PriceInput {
    private LocalDateTime startDate;
    private int productId;
    private int brandId;
}

