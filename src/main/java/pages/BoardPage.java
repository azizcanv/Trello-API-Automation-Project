package pages;

import io.restassured.response.Response;
import service.TrelloClient;

public class BoardPage extends TrelloClient {
    private String boardId;

    public String createBoard(String name) {
        Response response = postRequest("/boards/?name=" + name, "");
        this.boardId = response.jsonPath().getString("id");
        return boardId;
    }

    public void deleteBoard() {
        deleteRequest("/boards/" + boardId);
    }

    public String getBoardId() {
        return boardId;
    }
}
