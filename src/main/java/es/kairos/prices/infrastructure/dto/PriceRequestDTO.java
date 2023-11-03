package es.kairos.prices.infraestructure.dto;

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
