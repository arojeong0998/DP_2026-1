package hw.ch04.IDCard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String holder) {
        // 만료일: 발급일로부터 5년 후 (간단히 연도만 +5 처리)
        String expiryDate = (Integer.parseInt(baseDate.substring(0, 4)) + 5)
                + baseDate.substring(4);
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}