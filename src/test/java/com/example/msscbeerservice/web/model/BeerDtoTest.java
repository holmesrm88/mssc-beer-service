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
        String json = "{\"beerId\":\"42beb64c-dae0-4755-9512-4ef2eab5d429\",\"version\":null,\"createdDate\":\"2021-11-07T19:28:55.523359-05:00\",\"lastModifiedDate\":\"2021-11-07T19:28:55.524406-05:00\",\"beerName\":\"Matts Beer\",\"beerStyle\":\"ALE\",\"upc\":293857390,\"price\":8.99,\"quantityOnHand\":null}\n";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}