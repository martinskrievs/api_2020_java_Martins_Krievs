package helpers;

import domain.Board;

public class TestCaseContext {

    private static final ThreadLocal<TestCaseContext> THREAD_LOCAL = new ThreadLocal<>();


    private TestCaseContext() {
    }

    private Board clickupBoard;

    public static TestCaseContext get() {
        return THREAD_LOCAL.get();
    }

    public static void init() {

        THREAD_LOCAL.set(new TestCaseContext());

    }

    public static ThreadLocal<TestCaseContext> getThreadLocal() {
        return THREAD_LOCAL;
    }

    public Board getClickupBoard() {
        return clickupBoard;
    }

    public void setClickupBoard(Board clickupBoard) {
        this.clickupBoard = clickupBoard;
    }


}
