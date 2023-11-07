package es.kairos.prices.domain;

import java.time.LocalDateTime;

public interface PricePort {
    Price findfindByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId);
}
