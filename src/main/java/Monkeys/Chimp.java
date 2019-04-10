package Monkeys;

public class Chimp extends Monkey{

    public static int speedPerLetter = 1;

    public Chimp(String name, int textLength) {
        super(name, textLength,speedPerLetter);
    }

    public String type() {
        return super.type();
    }
}
