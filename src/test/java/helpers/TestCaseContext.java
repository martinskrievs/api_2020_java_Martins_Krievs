package helpers;

import domain.Board;
import domain.ClickUpList;
import domain.ClickupSpace;
import domain.ClickupTask;

import java.util.List;

public class TestCaseContext {

    private static final ThreadLocal<TestCaseContext> THREAD_LOCAL = new ThreadLocal<>();


    private TestCaseContext() {
    }
    private Board clickupBoard = new Board();
    private ClickUpList clickupList = new ClickUpList();
    private ClickupSpace clickupSpace = new ClickupSpace();
    private List<ClickupTask> tasks;

    public void setTasks(List<ClickupTask> tasks) {
        this.tasks = tasks;
    }

    public List<ClickupTask> getTasks() {
        return tasks;
    }

    public Board getClickupFolder() {
        return clickupBoard;
    }

    public ClickUpList getClickupList() {
        return clickupList;
    }

    public ClickupSpace getClickupSpace() {
        return clickupSpace;
    }

    public void setClickupFolder(Board clickupBoard) {
        this.clickupBoard = clickupBoard;
    }

    public void setClickupList(ClickUpList clickupList) {
        this.clickupList = clickupList;
    }

    public void setClickupSpace(ClickupSpace clickupSpace) {
        this.clickupSpace = clickupSpace;
    }

    public static TestCaseContext get() {
        return THREAD_LOCAL.get();
    }

    public static void init() {

        THREAD_LOCAL.set(new TestCaseContext());
    }


}
