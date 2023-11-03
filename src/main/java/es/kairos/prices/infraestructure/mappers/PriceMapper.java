package es.kairos.prices.infraestructure.mappers;

import es.kairos.prices.application.PriceInput;
import es.kairos.prices.infraestructure.dto.PriceRequestDTO;

public class PriceMapper {
    private PriceInput toPriceInput(PriceRequestDTO priceRequestDTO){
        return new PriceInput(
                priceRequestDTO.getStartDate(),
                priceRequestDTO.getProductId(),
                priceRequestDTO.getBrandId()
        );
    }
    
    
}
