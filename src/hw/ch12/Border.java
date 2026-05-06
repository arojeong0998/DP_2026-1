package hw.ch12;

public abstract class Border extends Display {
    protected Display display; // 장식하는 Display 객체

    public Border(Display display) {
        this.display = display;
    }

}
