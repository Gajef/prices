package es.kairos.prices.application;

import es.kairos.prices.domain.PriceService;
import es.kairos.prices.infrastructure.dto.PriceResponseDTO;

public class GetPriceUseCase {
    
    private PriceService priceService;
    private PriceApplicationMapper priceApplicationMapper;
    
    public PriceOutput getPrice(PriceInput priceInput){
        return priceApplicationMapper.toPriceOutput(
                    priceService.findByStartDate_productID_brandID(
                        priceInput.getStartDate(),
                        priceInput.getProductId(),
                        priceInput.getBrandId()
            )
        );
    }
}
