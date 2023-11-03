package es.kairos.prices.infrastructure.mappers;

import es.kairos.prices.application.PriceInput;
import es.kairos.prices.application.PriceOutput;
import es.kairos.prices.infrastructure.dto.PriceRequestDTO;
import es.kairos.prices.infrastructure.dto.PriceResponseDTO;

import java.util.Objects;

public class PriceInfrastructureMapper {
    public PriceInput toPriceInput(PriceRequestDTO priceRequestDTO){
        if (Objects.isNull(priceRequestDTO)) 
            return null;
        else {
            return new PriceInput(
                    priceRequestDTO.getStartDate(),
                    priceRequestDTO.getProductId(),
                    priceRequestDTO.getBrandId()
            );
        }
    }

    public PriceResponseDTO toPriceResponseDTO(PriceOutput priceOutput){
        if (Objects.isNull(priceOutput))
            return null;
        else {
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
}
