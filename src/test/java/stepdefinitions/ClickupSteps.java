package stepdefinitions;

import clients.ClickupClient;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.Board;
import domain.ClickUpList;
import domain.ClickupSpace;
import domain.ClickupTask;
import helpers.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ClickupSteps {
    private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();


    @When("User creates new folder in Clickup with id {string}")
    public void userCreatesNewFolder(String boardId) {
        String name = Stringo.getRandomString();
        TestCaseContext.get().setClickupFolder(BoardHelper.createClickupFolder(boardId, name));
        TestCaseContext.get().setClickupSpace(ClickupSpaceHelper.getClickupSpace(boardId));
    }

    @And("Then he check is folder is created")
    public void verifyThatFolderIsCreated() {
        String id = TestCaseContext.get().getClickupFolder().getId();
        Board fetchedClickupFolder = BoardHelper.getClickupFolder(TestCaseContext.get().getClickupFolder().getId());
        assertThat(fetchedClickupFolder.getId()).isEqualTo(id);
        assertThat(fetchedClickupFolder.getName()).isEqualTo(TestCaseContext.get().getClickupFolder().getName());

    }

    @Then("Delete folder that has been created")
    public void deleteFolder() {
        CLICKUP_CLIENT.deleteFolder(TestCaseContext.get().getClickupFolder().getId());
    }

    @When("User creates new folder in Clickup with id {string} and name {string}")
    public void userCreatesNewFolderInSpaceWithIdAndName(String boardId, String NameOFfl) {
        TestCaseContext.get().setClickupFolder(BoardHelper.createClickupFolder(boardId, NameOFfl));
        TestCaseContext.get().setClickupSpace(ClickupSpaceHelper.getClickupSpace(boardId));

    }

    @And("User creates a lsit with a name of {string}")
    public void createListInFolderWithName(String listName) {
        ClickUpList clickupList = ClickupListHelper.createClickupList(TestCaseContext.get().getClickupFolder().getId(), listName);
        TestCaseContext.get().setClickupList(clickupList);
    }

    @Then("User verifys that lsit has been made")
    public void verifyThatListIsCreated() {
        String listId = TestCaseContext.get().getClickupList().getId();
        ClickUpList fetchedClickupList = ClickupListHelper.getClickupList(listId);
        assertThat(fetchedClickupList.getId()).isEqualTo(listId);
        assertThat(fetchedClickupList.getName()).isEqualTo(TestCaseContext.get().getClickupList().getName());
    }

    @When("User updates Clickup with id {string} and name of it {string}")
    public void userUpdatesSpaceWithIdNameTo(String boardId, String NameOFcl) {
        ClickupSpace fetchedClickupSpace = ClickupSpaceHelper.updateClickupSpace(boardId, NameOFcl);
        TestCaseContext.get().setClickupSpace(fetchedClickupSpace);
    }

    @Then("Verify Space Id and Name")
    public void verifySpaceIdAndName() {
        String spaceId = TestCaseContext.get().getClickupSpace().getId();
        ClickupSpace fetchedClickupSpace = ClickupSpaceHelper.getClickupSpace(spaceId);
        assertThat(fetchedClickupSpace.getId()).isEqualTo(spaceId);
        assertThat(fetchedClickupSpace.getName()).isEqualTo(TestCaseContext.get().getClickupSpace().getName());
    }


    @And("User check if folder has been made {string}")
    public void userCreatesNewFolderWithName(String folderName) {
        Board fetchedClickupFolder = BoardHelper.createClickupFolder(TestCaseContext.get().getClickupSpace().getId(), folderName);
        TestCaseContext.get().setClickupFolder(fetchedClickupFolder);
    }

    @And("And creates a task {string}")
    public void createTasks(int taskCount) {
        ClickupTask clickupTask;
        ArrayList list = new ArrayList();
        for (int i = 0; i < taskCount; i++){
            String name = Stringo.getRandomString();
            clickupTask = ClickupTaskHelper.createClickupTask(TestCaseContext.get().getClickupList().getId(), name);
            list.add(clickupTask);
        }
        TestCaseContext.get().setTasks(list);
    }

    @Then("User check if every thing has been changed")
    public void verifyThatAllNecessaryTasksAreCreated() {
        List<ClickupTask> fetchedClickupTasks = ClickupTaskHelper.getClickupTasks(TestCaseContext.get().getClickupList().getId());
        assertThat(fetchedClickupTasks.size() == TestCaseContext.get().getTasks().size());
    }


}
