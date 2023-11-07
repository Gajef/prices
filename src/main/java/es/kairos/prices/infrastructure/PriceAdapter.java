package es.kairos.prices.infrastructure;

import es.kairos.prices.domain.model.Price;
import es.kairos.prices.domain.port.PricePort;
import es.kairos.prices.infrastructure.mappers.PriceInfrastructureMapper;

import java.time.LocalDateTime;

public class PriceAdapter implements PricePort {
    PriceRepository priceRepository;
    PriceInfrastructureMapper priceMapper;

    public Price findfindByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId) {
        return priceMapper.toPrice(priceRepository.findByStartDateAndProductIdAndBrandId(startDate, productId, brandId));
    }
}