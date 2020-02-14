package helpers;

import clients.ClickupClient;
import domain.ClickUpList;

public class ClickupListHelper {
    private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();

    public static ClickUpList createClickupList(String folderId, String listName) {
        return CLICKUP_CLIENT.createList(folderId, listName)
                .extract()
                .response()
                .as(ClickUpList.class);
    }


    public static ClickUpList getClickupList(String listId) {
        return CLICKUP_CLIENT.fetchList(listId)
                .extract()
                .response()
                .as(ClickUpList.class);
    }
}
