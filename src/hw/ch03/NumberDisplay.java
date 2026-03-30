package hw.ch03;

public class NumberDisplay implements AbstractDisplay {
    private int number;
    private int repeatCount;

    public NumberDisplay(int number, int repeatCount) {
        this.number = number;
        this.repeatCount = repeatCount;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }

    @Override
    public void display() {
        AbstractDisplay.super.display(repeatCount);
    }
}