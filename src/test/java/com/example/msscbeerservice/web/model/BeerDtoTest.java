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
        String json = "{\"version\":null,\"createdDate\":\"2021-11-08T10:37:21-0500\",\"lastModifiedDate\":\"2021-11-08T10:37:21-0500\",\"beerName\":\"Matts Beer\",\"beerStyle\":\"ALE\",\"upc\":293857390,\"price\":\"8.99\",\"quantityOnHand\":null,\"myLocalDate\":\"20211108\",\"beerId\":\"35698dfc-dff8-4956-9a69-ad7050bdb67c\"}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}