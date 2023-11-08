package es.kairos.prices.application;

import es.kairos.prices.domain.service.PriceService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Builder
@RequiredArgsConstructor
public class GetPriceUseCase {
    
    private final PriceService priceService;
    private final PriceApplicationMapper priceApplicationMapper;
    
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
