package practice.ch03;

public class Main {

    public static void main(String[] args) {
    
    //CharDisplay d1 = new CharDisplay('H'); 
    AbstractDisplay d1 = new CharDisplay('H'); // 부모 타입의 참조 변수로 자식 객체를 가리킨다.
    d1.display();
    d1.open();

      StringDisplay d2 = new StringDisplay("Hello, world.");
    d2.display();

    

    }

    
}
