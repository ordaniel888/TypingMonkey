package TypingTester;

import Monkeys.Chimp;
import Monkeys.Gorilla;
import Monkeys.Monkey;
import Monkeys.Orangutan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class MonkeysContest {

    private final List<Monkey> monkeys;
    private final String expectedText;
    private AtomicBoolean hasWinner = new AtomicBoolean(false);

    public MonkeysContest(String expectedText, int gorillasNumber, int orangutanNumber, int chimpNumber) {
        this.expectedText = expectedText;
        this.monkeys = generateMonkeys(expectedText.length(),gorillasNumber,orangutanNumber,chimpNumber);
    }


    public Optional<Monkey> startContest() {
        return monkeys.parallelStream().filter((monkey) -> {

            MonkeyTypingTester monkeyTypingTester = new MonkeyTypingTester(expectedText,monkey);

            boolean monkeyDidIt = false;
            while (!hasWinner.get()) {
                monkeyDidIt = monkeyTypingTester.testMonkey();
                if (monkeyDidIt) {
                    this.hasWinner.set(true);
                }
            }
            return monkeyDidIt;
        }).findFirst();
    }

    private List<Monkey> generateMonkeys(int textLength, int gorillasNumber, int orangutanNumber, int chimpNumber) {
        List<Monkey> monkeys = new ArrayList<>();

        for (int i = 1; i <= gorillasNumber; i++) {
            monkeys.add(new Gorilla(String.valueOf("Gorrila-" + i),textLength));
        }

        for (int i = 1; i <= orangutanNumber; i++) {
            monkeys.add(new Orangutan(String.valueOf("Orangutan-" + i),textLength));
        }

        for (int i = 1; i <= chimpNumber; i++) {
            monkeys.add(new Chimp(String.valueOf("Chimp-" + i),textLength));
        }
        return monkeys;
    }
}
