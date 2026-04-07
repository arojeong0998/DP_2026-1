package practice.ch05;

//싱글턴 패턴 적용
public class Singleton {

    //(3) singleton 객체를 하나 만들어서 보관하는 변수
    private static Singleton singleton = new Singleton(); //클래스가 로딩될때 singleton 객체가 하나 만들어짐

    //(1) 생성자를 private으로 함
    private Singleton() {
    System.out.println("싱글턴 객체가 생성되었습니다.");
    }
    
    //(2) singleton 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
         return singleton;
    }
}
