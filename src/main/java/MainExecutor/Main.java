package MainExecutor;

import Monkeys.Chimp;
import Monkeys.Gorilla;
import Monkeys.Monkey;
import Monkeys.Orangutan;
import TypingTester.MonkeyTypingTester;
import TypingTester.MonkeysContest;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Input
        String expectedText = "He";
        int textLength = expectedText.length();
        int gorillasNumber = 2;
        int orangutanNumber = 1;
        int chimpNumber = 1;

        MonkeysContest monkeysContest = new MonkeysContest(expectedText,
                gorillasNumber,
                orangutanNumber,
                chimpNumber);
        Optional<Monkey> contestWinner = monkeysContest.startContest();

        System.out.println(contestWinner.get().name());
    }
}
