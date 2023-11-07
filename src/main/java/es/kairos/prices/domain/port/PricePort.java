package es.kairos.prices.domain.port;

import es.kairos.prices.domain.model.Price;

import java.time.LocalDateTime;

public interface PricePort {
    Price findfindByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId);
}
