package Monkeys;

import RandomTextGenerator.RandomString;

public abstract class Monkey {
    private final  String name;
    private final int textLength;
    private final int speedPerLetter;
    private final RandomString randomTextGenerator;

    public Monkey(String name, int textLength, int speedPerLetter) {
        this.name = name;
        this.textLength = textLength;
        this.speedPerLetter = speedPerLetter;
        this.randomTextGenerator = new RandomString(textLength,speedPerLetter);
    }

    public int getTextLength() {
        return textLength;
    }

    public String type() {
        return randomTextGenerator.nextString();
    }

    public String name() {
        return name;
    }
}
