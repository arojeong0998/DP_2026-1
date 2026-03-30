package practice.ch04.idcard;


import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100; //정수 기본 데이터 타입 
    private Map<Integer, String> database = new HashMap<>(); //정수 객체 

    //부모 타입은 자식 객체를 참조할 수 있다.
    protected IDCard createProduct(String owner) {
        IDCard card = new IDCard(owner, serial);
        database.put(serial, owner);  // 시리얼 번호와 오너 이름 매핑
        serial++;
        return card;
    }


    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product; //다운캐스팅
        System.out.println(product + "을 등록했습니다.");
    }

    // HashMap으로 관리하는 메소드들
    public Map<Integer, String> getDatabase() {
        return database;
    }

    public String getOwner(int serial) {
        return database.get(serial);
    }

    public int getNextSerial() {
        return serial;
    }

    public int getTotalCards() {
        return database.size();
    }
}
