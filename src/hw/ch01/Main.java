package hw.ch01;
 
import java.util.Iterator;
 
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
 
        // Step 4-1: 과제 테이블 데이터
        bookShelf.appendBook(new Book("클린코드",          "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스",           "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바",       "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블",          "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠",             "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링",            "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기",        "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자",            "소설", 1943,  9000));
 
        // ── 기본 Iterator (전체 순회) ──────────────────────────────
        System.out.println("=== 전체 목록 (Iterator) ===");
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.printf("%-22s | %s | %d년 | %.0f원%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println();
 
        // ── 확장 for문 ────────────────────────────────────────────
        System.out.println("=== 전체 목록 (확장 for문) ===");
        for (Book book : bookShelf) {
            System.out.printf("%-22s | %s | %d년 | %.0f원%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println();
 
        // ── [4-2] 장르 필터 Iterator 테스트: 소설 ────────────────
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│          [4-2] 장르 필터: '소설' 장르 도서 목록         │");
        System.out.println("├──────────────────────┬──────┬────────┬──────────────┤");
        System.out.println("│ 제목                 │ 장르 │ 출판연도 │     가격      │");
        System.out.println("├──────────────────────┼──────┼────────┼──────────────┤");
        Iterator<Book> novelIt = bookShelf.iteratorByGenre("소설");
        while (novelIt.hasNext()) {
            Book book = novelIt.next();
            System.out.printf("│ %-20s │ %-4s │  %4d년 │ %,8.0f원 │%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println("└──────────────────────┴──────┴────────┴──────────────┘");
        System.out.println();
 
        // ── [4-3] 출판연도 역순 Iterator 테스트 ──────────────────
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│       [4-3] 출판연도 역순 (최신 → 오래된 순) 도서 목록   │");
        System.out.println("├──────────────────────┬──────┬────────┬──────────────┤");
        System.out.println("│ 제목                 │ 장르 │ 출판연도 │     가격      │");
        System.out.println("├──────────────────────┼──────┼────────┼──────────────┤");
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            System.out.printf("│ %-20s │ %-4s │  %4d년 │ %,8.0f원 │%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println("└──────────────────────┴──────┴────────┴──────────────┘");
        System.out.println();
    }
}