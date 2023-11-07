package es.kairos.prices.domain.service;

import es.kairos.prices.domain.model.Price;
import es.kairos.prices.domain.port.PricePort;

import java.time.LocalDateTime;

public class PriceService {

    private PricePort pricePort;
    public Price findByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId) {
        return pricePort.findfindByStartDate_productID_brandID(startDate, productId, brandId);
    }
}
