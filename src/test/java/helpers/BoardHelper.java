package helpers;

import clients.ClickupClient;
import domain.Board;
public class BoardHelper {

        private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();

        public static Board createClickupFolder(String spaceId, String folderName) {
            return CLICKUP_CLIENT.createFolder(spaceId, folderName)
                    .extract()
                    .response()
                    .as(Board.class);
        }

        public static Board getClickupFolder(String folderId) {
            return CLICKUP_CLIENT.fetchFolder(folderId)
                    .extract()
                    .response()
                    .as(Board.class);
        }

    }



