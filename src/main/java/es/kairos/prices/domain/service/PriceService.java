package es.kairos.prices.domain.service;

import es.kairos.prices.domain.model.Price;
import es.kairos.prices.domain.port.PricePort;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
@Builder
public class PriceService {

    private final PricePort pricePort;
    
    public Price findByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId) {
        return pricePort.findfindByStartDate_productID_brandID(startDate, productId, brandId);
    }
}
