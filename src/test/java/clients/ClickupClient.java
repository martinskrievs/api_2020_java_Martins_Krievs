package clients;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;

public class ClickupClient {
    private static final String API_Token = "pk_4532502_1FL26CQT2M1VG83CNL2RSE2IMFN64D9A";

   // private static final String CLICKUP_ID = "2493404";

    private static final String CLICKUPFOLDER_ID = "6858031";
    private static final String CLICKUP_URL = "/space/";
    private static final String CLICKUP_FOLDER_URL = "/folder";
    private static final String CLICKUP_BASE_URL = "https://api.clickup.com/api/v2";


    public ValidatableResponse fetchClickupBoard(String boardId) {
        return given()
                .header("authorization", API_Token)
                .contentType(ContentType.JSON)
                .body("{\n" + "   \" name\": \"New Folder uuu test\"\n" + "}")
                .when()
                .post(CLICKUP_BASE_URL + CLICKUP_URL + boardId)
                .then()
                .log().ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode());
    }


    public void updatedClickupBoardName(String boardId, String newBoardName) {
        given()
                .param("token", API_Token)
                .param("name", newBoardName)
                .when()
                .put(String.format(CLICKUP_FOLDER_URL, CLICKUP_URL, boardId))
                .then().log().ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode());
    }








}
