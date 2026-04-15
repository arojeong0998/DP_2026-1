package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderChar;

    // 1. 생성자
    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    // 2. use() 메소드
    @Override
    public void use(String s) {
        int len = s.length();

        // 위쪽 라인
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();

        // 본문
        System.out.println(s);

        // 아래쪽 라인
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }

    // 3. createCopy() 메소드
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}