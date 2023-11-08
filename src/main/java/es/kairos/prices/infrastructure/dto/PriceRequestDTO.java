package es.kairos.prices.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class PriceRequestDTO {
    @JsonFormat(pattern = "yyyy-MM-dd HH.mm.ss")
    private LocalDateTime startDate;
    private int productId;
    private int brandId;
}
