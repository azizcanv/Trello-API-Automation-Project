package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class TrelloClient {
    protected static final String BASE_URL = "https://api.trello.com/1";
    protected static final String KEY = "YOUR_KEY";
    protected static final String TOKEN = "YOUR_TOKEN";

    public TrelloClient() {
        RestAssured.baseURI = BASE_URL;
    }

    protected Response postRequest(String endpoint, String body) {
        return given()
                .header("Content-Type", "application/json")
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .body(body)
                .post(endpoint);
    }

    protected Response putRequest(String endpoint, String body) {
        return given()
                .header("Content-Type", "application/json")
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .body(body)
                .put(endpoint);
    }

    protected Response deleteRequest(String endpoint) {
        return given()
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .delete(endpoint);
    }

    protected Response getRequest(String endpoint) {
        return given()
                .queryParam("key", KEY)
                .queryParam("token", TOKEN)
                .get(endpoint);
    }
}
