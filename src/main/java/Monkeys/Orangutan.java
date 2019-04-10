package Monkeys;

public class Orangutan extends Monkey{

    public static int speedPerLetter = 3;

    public Orangutan(String name, int textLength) {
        super(name, textLength,speedPerLetter);
    }

    public String type() {
        return super.type();
    }
}
