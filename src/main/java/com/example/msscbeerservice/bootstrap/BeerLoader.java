package com.example.msscbeerservice.bootstrap;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("MIPA")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(33719384703L)
                    .price(new BigDecimal("12.96"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("BrewThru")
                    .beerStyle("Lager")
                    .quantityToBrew(200)
                    .upc(33719389647L)
                    .price(new BigDecimal("8.99"))
                    .minOnHand(12)
                    .build());
        }
    }
}
