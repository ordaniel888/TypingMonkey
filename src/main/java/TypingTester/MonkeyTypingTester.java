package TypingTester;

import Monkeys.Monkey;

import java.util.List;

public class MonkeyTypingTester {

    private final String expectedText;
    private final Monkey monkey;


    public MonkeyTypingTester(String expectedText, Monkey monkey) {
        this.monkey = monkey;
        this.expectedText = expectedText;
    }

    public boolean testMonkey() {
        String actualText = monkey.type();
        return actualText.equals(expectedText);
    }
}
