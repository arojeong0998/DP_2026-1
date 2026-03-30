package hw.ch03;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() {
        display(5); // 기본값 5회
    }

    public default void display(int repeatCount) {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}