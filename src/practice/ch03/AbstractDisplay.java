package practice.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    abstract protected void open(); // 상속 관계나 자식만 접근할 수 있다. 
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀을 제공함
    public final void display() { //final이므로 하위 클래스에서 오버라이드할 수 없다. 큰 흐름은 자식들이 바꿀 수 없다
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
