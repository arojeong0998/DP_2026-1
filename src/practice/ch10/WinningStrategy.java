package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random; //난수를 발생시키는 객체 
    private boolean won = false;
    private Hand prevHand; // 이전에 낸 손 

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        Random random ;
        if (!won) { // 이전에 졌다면 랜덤하게 손을 선택한다
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
