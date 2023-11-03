package es.kairos.prices.infrastructure.mappers;

import es.kairos.prices.application.PriceInput;
import es.kairos.prices.infrastructure.dto.PriceRequestDTO;

public class PriceInfrastructureMapper {
    public PriceInput toPriceInput(PriceRequestDTO priceRequestDTO){
        return new PriceInput(
                priceRequestDTO.getStartDate(),
                priceRequestDTO.getProductId(),
                priceRequestDTO.getBrandId()
        );
    }
}
