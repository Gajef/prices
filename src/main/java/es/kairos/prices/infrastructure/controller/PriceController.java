package es.kairos.prices.infrastructure.controller;

import es.kairos.prices.application.GetPriceUseCase;
import es.kairos.prices.application.PriceInput;
import es.kairos.prices.application.PriceOutput;
import es.kairos.prices.infrastructure.dto.PriceRequestDTO;
import es.kairos.prices.infrastructure.dto.PriceResponseDTO;
import es.kairos.prices.infrastructure.mappers.PriceInfrastructureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prices")
public class PriceController {
  private final GetPriceUseCase getPriceUseCase;
  private final PriceInfrastructureMapper priceInfrastructureMapper;
  
  @GetMapping
  ResponseEntity<PriceResponseDTO> getPrice(@RequestBody PriceRequestDTO priceRequestDTO) {
    PriceInput priceInput = priceInfrastructureMapper.toPriceInput(priceRequestDTO);
    PriceOutput priceOutput = getPriceUseCase.getPrice((priceInput));
    return ResponseEntity.ok().body(priceInfrastructureMapper.toPriceResponseDTO(priceOutput));
  }
}
