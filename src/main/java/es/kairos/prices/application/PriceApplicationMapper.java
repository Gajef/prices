package es.kairos.prices.application;
import es.kairos.prices.domain.Price;

import java.util.Objects;

public class PriceApplicationMapper {
    public PriceOutput toPriceOutput(Price price){
        if (Objects.isNull(price)) 
            return null;
        else {
            return new PriceOutput(
                    price.getProductID(),
                    price.getBrandID(),
                    price.getPriceList(),
                    price.getStartDate(),
                    price.getEndDate(),
                    price.getPrice()
            );
        }
    }
}
