package com.example.msscbeerservice.bootstrap;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class BeerLoader implements CommandLineRunner {
    public static final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID BEER_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID BEER_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");
    public static final String BEER_1_UPC = "0373263858737";
    public static final String BEER_2_UPC = "0003746281247";
    public static final String BEER_3_UPC = "0016734700245";

    private final BeerRepository beerRepository;

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
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.96"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("BrewThru")
                    .beerStyle("Lager")
                    .quantityToBrew(200)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("8.99"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Mighty Force")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("5.99"))
                    .minOnHand(12)
                    .build());
        }
    }
}
