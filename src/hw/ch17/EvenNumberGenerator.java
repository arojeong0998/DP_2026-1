package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;
    private int end;

    public EvenNumberGenerator(int start, int end) {
        this.number = start;
        this.end = end;
    }

    public int getNumber() {
        return number;
    }

    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
}
