package hw.ch01;

public class Book {
    private String name;
    private String genre;
    private int year;
    private double price;

    // 기존 생성자 유지 (Main.java 호환)
    public Book(String name) {
        this.name = name;
        this.genre = "";
        this.year = 0;
        this.price = 0.0;
    }

    // 오버로딩: 새 필드를 모두 받는 생성자
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}