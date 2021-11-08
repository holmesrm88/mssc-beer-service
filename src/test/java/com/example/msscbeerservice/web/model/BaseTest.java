package com.example.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto(){
        return BeerDto.builder().beerName("Matts Beer").beerStyle(BeerStyleEnum.ALE).id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now()).lastModifiedDate(OffsetDateTime.now()).price(new BigDecimal("8.99")).upc(293857390L).build();
    }
}
