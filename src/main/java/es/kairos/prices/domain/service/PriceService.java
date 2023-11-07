package es.kairos.prices.domain;

import es.kairos.prices.application.PriceInput;
import es.kairos.prices.application.PriceOutput;

import java.time.LocalDateTime;

public class PriceService {

    private PricePort pricePort;
    public Price findByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId) {
        return pricePort.findfindByStartDate_productID_brandID(startDate, productId, brandId);
    }
}
