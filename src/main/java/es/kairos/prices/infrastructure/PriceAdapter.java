package es.kairos.prices.infrastructure;

import es.kairos.prices.domain.model.Price;
import es.kairos.prices.domain.port.PricePort;
import es.kairos.prices.infrastructure.mappers.PriceInfrastructureMapper;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Data
@Builder
@Repository
public class PriceAdapter implements PricePort {
    private final PriceRepository priceRepository;
    private final PriceInfrastructureMapper priceMapper;

    public Price findfindByStartDate_productID_brandID(LocalDateTime startDate, int productId, int brandId) {
        return priceMapper.toPrice(priceRepository.findByStartDateAndProductIDAndBrandID(startDate, productId, brandId));
    }
}