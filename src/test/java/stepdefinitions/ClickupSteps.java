package stepdefinitions;

import clients.ClickupClient;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.Board;
import helpers.TestCaseContext;

import static helpers.BoardHelper.getClickupBoard;
import static org.assertj.core.api.Assertions.assertThat;

public class ClickupSteps {
    private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();

    @Given("User has CLICKUP space with ID {string}")
    public void userHasCLICKUPSpaceWithID(String boardId) {
        Board fetchClickupBoard = getClickupBoard(boardId);

        TestCaseContext.get().setClickupBoard(fetchClickupBoard);

        assertThat(fetchClickupBoard.getId()).isEqualTo(boardId);

    }


    @When("user changes Click board name to {string}")
    public void userChangesClickBoardNameTo(String BoardName) {
        String boardId = TestCaseContext.get().getClickupBoard().getId();

        CLICKUP_CLIENT.updatedClickupBoardName(boardId, BoardName);
    }


    @Then("check if board name was updated to {string}")
    public void checkIfBoardNameWasUpdatedTo(String currentBoardName) {
        String boardId = TestCaseContext.get().getClickupBoard().getId();

        Board fetchClickupBoard = getClickupBoard(boardId);
        assertThat(fetchClickupBoard.getId()).isEqualTo(boardId);
        assertThat(fetchClickupBoard.getName()).isEqualTo(currentBoardName);
    }
}
