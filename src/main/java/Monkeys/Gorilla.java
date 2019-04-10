package Monkeys;

public class Gorilla extends Monkey{

    public static int speedPerLetter = 2;

    public Gorilla(String name, int textLength) {
        super(name, textLength,speedPerLetter);
    }

    public String type() {
        return super.type();
    }
}
