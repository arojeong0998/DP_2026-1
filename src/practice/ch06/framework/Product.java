package practice.ch06.framework;

public interface Product extends Cloneable {
//public interface Product { // -< 이렇게 하면 에러남 

    public abstract void use(String s);
    public abstract Product createCopy();
}
