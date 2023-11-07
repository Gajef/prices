package es.kairos.prices.infrastructure;

import es.kairos.prices.infrastructure.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface PriceRepository extends JpaRepository<PriceEntity, Integer> { 
    PriceEntity findByStartDateAndProductIdAndBrandId(LocalDateTime startDate, int productId, int brandId);
}
