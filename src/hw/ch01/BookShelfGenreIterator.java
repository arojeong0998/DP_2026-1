package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String targetGenre;
    private int index;
    private Book nextBook;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.targetGenre = genre;
        this.index = 0;
        this.nextBook = findNext();
    }

    // 다음 해당 장르 책을 미리 탐색
    private Book findNext() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            index++;
            if (book.getGenre().equals(targetGenre)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return nextBook != null;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book result = nextBook;
        nextBook = findNext();
        return result;
    }
}