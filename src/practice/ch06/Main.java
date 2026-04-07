package practice.ch06;

import practice.ch06.MessageBox;
import practice.ch06.framework.Manager;
import practice.ch06.framework.Product;

public class Main {
    
    public static void main(String[] args) {
       /* 
        MessageBox mbox1 = new MessageBox('*');
        mbox1.use("Hello, World.");

        // (2) mbox1을 복제하여 mbox2 생성
        mbox1.createCopy().use("Hello, Universe."); //골뱅이로 똑같이 메시지박스가 만들어짐

        //qhsdl dlfdlmagks
        UnderlinePen upen1 = new UnderlinePen('+');
        upen1.use("Hello, World.");

        upen1.createCopy().use("Hello, Universe.");
        */
        
        //준비
        Manager manager = new Manager();
        MessageBox mbox1 = new MessageBox('*');
        MessageBox mbox2 = new MessageBox('/');
       UnderlinePen upen1 = new UnderlinePen('+');

        //등록
        manager.register("star box", mbox1);
        manager.register("plus line", upen1);
        manager.register("slash box", mbox2);

        //등록된 이름으로 복제품을 얻어서 사용
        Product p1 = manager.create("star box");
        p1.use("Hello, World.");
        Product p2 = manager.create("plus line");
        p2.use("Hello, World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World.");
      
    }
}
