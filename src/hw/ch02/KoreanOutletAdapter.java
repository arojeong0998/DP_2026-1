package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet outlet;

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public int charge() {
        outlet.charge();
        return 220; // 한국의 전압은 220V입니다.
    }
    
}
