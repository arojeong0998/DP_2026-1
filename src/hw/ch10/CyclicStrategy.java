package hw.ch10;

public class CyclicStrategy implements Strategy {
    
    private int index = 0;  // 현재 순서 추적

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(index);
        index = (index + 1) % 3;  // 0→1→2→0 순환
        return hand;
    }

    @Override
    public void study(boolean win) {
        // 아무것도 하지 않음 — 순환 전략은 승패 무관
    }
    
}
