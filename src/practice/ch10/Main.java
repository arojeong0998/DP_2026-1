package practice.ch10;

public class Main {

    public static void main(String[] args) {
       // 손 2개를 얻음
       /*/
       Hand h1 = Hand.ROCK;
       Hand h2 = Hand.SCISSORS;

       //손을 대결시킴 
         if (h1.isStrongerThan(h2)) {
              System.out.println("h1이 이겼습니다.");
         } else if (h1.isWeakerThan(h2)) {
              System.out.println("h2가 이겼습니다.");
         } else {
              System.out.println("비겼습니다.");
         }
       
        /* */

        //플레이어 2명 만들기 
        Player player1 = new Player("정아로", new WinningStrategy(314));
        Player player2 = new Player("손흥민", new WinningStrategy(15));

        for (int i=0; i<10; i++) {
             //플레이어 2명에게서 각각 손을 얻음 
                Hand nextHand1 = player1.nextHand();
                Hand nextHand2 = player2.nextHand();
                //손을 대결시킴
                if (nextHand1.isStrongerThan(nextHand2)) {
                    System.out.println("Winner: " + player1);
                    player1.win();
                    player2.lose();
                } else if (nextHand1.isWeakerThan(nextHand2)) {
                    System.out.println("Winner: " + player2);
                    player1.lose();
                    player2.win();
                } else {
                    System.out.println("Even...");
                    player1.even();
                    player2.even();
                }
        }

        System.out.println("Total result:");
       System.out.println(player1);
       System.out.println(player2);     
} 

}
