package es.kairos.prices.ui;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/prices")
public class PriceController {
  @GetMapping("")
  ResponseEntity getPrice(@PathVariable LocalDateTime startDate, @PathVariable int productId, @PathVariable int brandId) {
    
  }
}
