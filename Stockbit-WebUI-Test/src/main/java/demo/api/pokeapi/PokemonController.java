package demo.api.pokeapi;


import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;

public class PokemonController {

  public Response getPokemonData(String pokemonName) {
    pokemonName = pokemonName.toLowerCase();
    Response response = given().baseUri("https://pokeapi.co").basePath("/api")
        .pathParam("pokemonName", pokemonName)
        .log().all()
        .contentType(ContentType.JSON)
        .accept(ContentType.JSON).get("/v2/pokemon/{pokemonName}");
    response.getBody().prettyPrint();
    return response;
  }

  public static void main(String[] args) {
    List<Long> data = new ArrayList<>();
    data.add(10L);
    data.add(11L);
    data.add(12L);
    System.out.println(data.toString());
  }
}
