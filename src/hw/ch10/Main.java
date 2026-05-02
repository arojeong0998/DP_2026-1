package hw.ch10;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("20120998 정아로");
        System.out.println("");
 
        Player player1 = new Player("Taro", new RandomStrategy(0));
 
        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());
 
        // CyclicStrategy 순환 확인
        System.out.println("CyclicStrategy 의 손가락 순환:");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i + 1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }
 
        // player1(RandomStrategy) vs player2(CyclicStrategy) 10번 게임
        System.out.println("\n===== 10번 게임 진행 =====");
        for (int i = 0; i < 10; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            System.out.printf("Round %2d: %s vs %s → ", i + 1, hand1, hand2);
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Taro 승");
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Bob 승");
                player1.lose();
                player2.win();
            } else {
                System.out.println("무승부");
                player1.even();
                player2.even();
            }
        }
 
        System.out.println("\n===== 최종 결과 =====");
        System.out.println(player1);
        System.out.println(player2);
    }
}
