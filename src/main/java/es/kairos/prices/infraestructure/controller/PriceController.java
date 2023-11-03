package es.kairos.prices.infraestructure.controller;

import es.kairos.prices.application.GetPriceUseCase;
import es.kairos.prices.application.PriceInput;
import es.kairos.prices.infraestructure.dto.PriceRequestDTO;
import es.kairos.prices.infraestructure.dto.PriceResponseDTO;
import es.kairos.prices.infraestructure.mappers.PriceMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/prices")
public class PriceController {
  
  private GetPriceUseCase getPriceUseCase;
  private PriceMapper priceMapper;
  
  @GetMapping("")
  ResponseEntity<PriceResponseDTO> getPrice(@RequestBody PriceRequestDTO priceRequestDTO) {
    PriceInput priceInput = priceMapper.toPriceInput(priceRequestDTO);
    return ResponseEntity.ok().body(getPriceUseCase.getPrice(priceInput));
  }
}
