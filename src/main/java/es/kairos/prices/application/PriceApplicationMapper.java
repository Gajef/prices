package es.kairos.prices.application;

import es.kairos.prices.infrastructure.dto.PriceResponseDTO;

public class PriceApplicationMapper {
    public PriceResponseDTO toPriceResponseDTO(PriceOutput priceOutput){
        return new PriceResponseDTO(
                priceOutput.getProductId(),
                priceOutput.getBrandId(),
                priceOutput.getPriceList(), 
                priceOutput.getStartDate(),
                priceOutput.getEndDate(),
                priceOutput.getPrice()
        );
    }
}
