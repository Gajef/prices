package es.kairos.prices.ui;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class PriceRequestDTO {
    private LocalDateTime startDate;
    private int productId;
    private int brandId;
}
