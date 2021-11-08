package com.example.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializedTo() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialized() throws JsonProcessingException {
        String json = "{\"version\":null,\"createdDate\":\"2021-11-08T08:32:06-0500\",\"lastModifiedDate\":\"2021-11-08T08:32:06.369771-05:00\",\"beerName\":\"Matts Beer\",\"beerStyle\":\"ALE\",\"upc\":293857390,\"price\":\"8.99\",\"quantityOnHand\":null,\"beerId\":\"c33e27c2-624e-4e75-be97-ffec9be6f509\"}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}