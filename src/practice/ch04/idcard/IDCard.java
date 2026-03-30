package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
 // 부모의 인자 없는 생성자를 호출함
 // super(); // 생략 가능 기본으로 호출이 된다. 
   // super("x","y") ; //부모의 인자 있는 생성자를 호출함// 
   // 부모의 생성자 호출은 자식의 생성자에서 가장 먼저 일어나야 한다.
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {//to스트링 있는 거 하고 없는 거 하고 똑같이 나옴
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    //제1부모 object class에 tostring 클래스를 오버라이드 한다. 
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
