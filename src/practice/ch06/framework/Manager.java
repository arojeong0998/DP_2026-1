package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

// Product를 등록하고, 필요할 때마다 복제해서 제공하는 클래스
public class Manager {
    //product 부모 타입 
    private Map<String,Product> showcase = new HashMap<>();
    //(key, value) 쌍으로 저장하는 map 

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);//(key, value) 쌍으로 저장하는 map 
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); //key로 value를 가져오는 메소드
        return p.createCopy(); //복제해서 반환 !!!! 
    }
}
