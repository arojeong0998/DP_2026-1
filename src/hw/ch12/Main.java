package hw.ch12;

public class Main {
     public static void main(String[] args) {


        System.out.println("");
        System.out.println("=== [20120998 정아로 ===");
        System.out.println("");
 
        // MultiStringDisplay 준비
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful.");
 
        // [2-1] 원본 출력
        System.out.println("=== [2-1] 원본 출력 ===");
        md.show();
 
        System.out.println();
 
        // [2-2] NumberedBorder 단독 적용
        System.out.println("=== [2-2] NumberedBorder 단독 ===");
        Display d1 = new NumberedBorder(md);
        d1.show();
 
        System.out.println();
 
        // [2-3] FullBorder + NumberedBorder 조합
        System.out.println("=== [2-3] FullBorder + NumberedBorder ===");
        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();
 
        System.out.println();
 
        // [2-4] SideBorder + FullBorder 조합 (기대 출력 기준)
        System.out.println("=== [2-4] SideBorder + FullBorder 3단 중첩 ===");
        Display d3 = new SideBorder(new FullBorder(md), '*');
        d3.show();
    }
}
