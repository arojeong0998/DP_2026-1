package practice.ch04;

import ch04.A2.framework.Product;
import practice.ch04.idcard.IDCardFactory;


public class Main {
    public static void main(String[] args) {
        // (1) Factory를 사용하여 카드 생성
        IDCardFactory factory = new IDCardFactory();
        practice.ch04.framework.Product c1 = factory.create("홍길동");
        c1.use();
        
        Product c2 = factory.create("이순신");
        c2.use();
    }
}
