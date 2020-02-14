package stepdefinitions;

import clients.ClickupClient;
import helpers.TestCaseContext;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    ClickupClient clickupClient = new ClickupClient();

    @Before
    public void beforeAll(){
        TestCaseContext.init();
    }

   @After("@CreatNewFolder")
    public void deleteFolder(){
        clickupClient.deleteFolder(TestCaseContext.get().getClickupFolder().getId());
    }

    @After("@ClickUPNameChanged")
    public void afterBoardNamehasBeenChaged(){
        clickupClient.updateSpaceName(TestCaseContext.get().getClickupSpace().getId(), "Default space name");
    }
}
