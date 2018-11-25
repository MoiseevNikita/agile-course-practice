package ru.unn.agile.InfixToPostfixNotationConverter.View;

import org.junit.Test;

public class FakeViewTests {
    @Test
    public void canStartApplication() {
        Thread t = new Thread(() -> {
            String[] args = {""};
            Main.main(args);
        });

        t.start();

        // Let the application start properly before interrupting it
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException exc) { }
        t.interrupt();
    }
}
