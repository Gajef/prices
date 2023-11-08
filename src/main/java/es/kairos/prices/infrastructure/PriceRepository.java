package es.kairos.prices.infrastructure;

import es.kairos.prices.infrastructure.entities.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
@EnableJpaRepositories
public interface PriceRepository extends JpaRepository<PriceEntity, Integer> { 
    PriceEntity findByStartDateAndProductIDAndBrandID(LocalDateTime startDate, int productID, int brandID);
}
