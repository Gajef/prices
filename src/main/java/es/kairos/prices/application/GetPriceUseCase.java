package es.kairos.prices.application;

import es.kairos.prices.domain.service.PriceService;

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
