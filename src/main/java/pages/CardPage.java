package pages;

import io.restassured.response.Response;
import service.TrelloClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardPage extends TrelloClient {
    private final List<String> cardIds = new ArrayList<>();

    public String createCard(String boardId, String name) {
        Response response = postRequest("/cards?idList=" + getFirstListId(boardId) + "&name=" + name, "");
        String cardId = response.jsonPath().getString("id");
        cardIds.add(cardId);
        return cardId;
    }

    public void updateRandomCard(String newName) {
        if (!cardIds.isEmpty()) {
            Random rand = new Random();
            String cardId = cardIds.get(rand.nextInt(cardIds.size()));
            putRequest("/cards/" + cardId + "?name=" + newName, "");
        }
    }

    public void deleteAllCards() {
        for (String id : cardIds) {
            deleteRequest("/cards/" + id);
        }
    }

    private String getFirstListId(String boardId) {
        Response response = getRequest("/boards/" + boardId + "/lists");
        return response.jsonPath().getString("id[0]");
    }
}
