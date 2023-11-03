package es.kairos.prices.ui;

import java.time.LocalDateTime;

import es.kairos.prices.application.PriceUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/prices")
public class PriceController {
  
  PriceUseCase priceUseCase;
  @GetMapping("")
  ResponseEntity<PriceResponseDTO> getPrice(@RequestBody PriceRequestDTO priceRequestDTO) {
    return ResponseEntity.ok().body(priceUseCase.getPrice(priceRequestDTO));
  }
}
