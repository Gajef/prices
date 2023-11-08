package es.kairos.prices.utils;

import es.kairos.prices.infrastructure.PriceRepository;
import es.kairos.prices.infrastructure.entities.PriceEntity;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class DatabaseInitializer {
    private final PriceRepository priceRepository;
    private static final String DATE_TIME_FORMATTER = "yyyy-MM-dd-HH.mm.ss";
    
    @PostConstruct
    public void init(){
        List<List<String>> csvList = readCSV();
        for (List<String> lista : csvList) {
            priceRepository.save(
                new PriceEntity(
                        null,
                    Integer.parseInt(lista.get(0)),
                    stringToDate(lista.get(1)),
                    stringToDate(lista.get(2)),
                    Integer.parseInt(lista.get(3)),
                    Integer.parseInt(lista.get(4)),
                    Integer.parseInt(lista.get(5)),
                    Float.parseFloat(lista.get(6)),
                    lista.get(7)
                )
            );
        }
    }
    
    private  List<List<String>> readCSV(){
        List<List<String>> prices = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/es/kairos/prices/utils/prices_(3).csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                prices.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            System.err.println("Hubo un error: " + e.getMessage());
        }
        prices.remove(0);
        return prices;
    }
    
    private LocalDateTime stringToDate(String stringDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMATTER);
        return LocalDateTime.parse(stringDate, formatter);
    }
}
