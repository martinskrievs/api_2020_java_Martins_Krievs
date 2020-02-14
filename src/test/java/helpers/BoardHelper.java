package helpers;

import clients.ClickupClient;
import domain.Board;

import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;


public class BoardHelper {

    private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();

    public static Board getClickupBoard(String boardId) {
        return CLICKUP_CLIENT.fetchClickupBoard(boardId)
                .extract()
                .response()
                .as(Board.class);
    }



}
