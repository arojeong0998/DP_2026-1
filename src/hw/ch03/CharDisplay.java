package hw.ch03;

public class CharDisplay implements AbstractDisplay {
    private char ch;
    private int repeatCount;

    // 기본 생성자 (기존 호환성 유지)
    public CharDisplay(char ch) {
        this.ch = ch;
        this.repeatCount = 5;
    }

    // 반복 횟수 지정 생성자
    public CharDisplay(char ch, int repeatCount) {
        this.ch = ch;
        this.repeatCount = repeatCount;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void display() {
        AbstractDisplay.super.display(repeatCount);
    }
}