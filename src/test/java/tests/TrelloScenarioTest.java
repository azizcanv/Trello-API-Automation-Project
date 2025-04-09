package tests;

import org.junit.jupiter.api.Test;
import pages.BoardPage;
import pages.CardPage;

public class TrelloScenarioTest {

    @Test
    public void runTrelloScenario() {
        BoardPage boardPage = new BoardPage();
        String boardId = boardPage.createBoard("board1");

        CardPage cardPage = new CardPage();
        cardPage.createCard(boardId, "Card 1");
        cardPage.createCard(boardId, "Card 2");

        cardPage.updateRandomCard("Updated Card");

        cardPage.deleteAllCards();
        boardPage.deleteBoard();
    }
}