import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void setup(){
        library = new Library();
        book = new Book("The Shining", "Stephen King", "Horror");
        book4 = new Book("Under the Skin", "Michael Faber", "Science Fiction");
        book2 = new Book("The Institute", "Stephen King", "Horror");
        book3 = new Book("11/22/63", "Stephen King", "Romance");
        book5 = new Book("The Bone Clocks", "David Mitchell", "Science Fiction");
        library.addBookToInventory(book);
        library.addBookToInventory(book2);
        library.addBookToInventory(book3);
        library.addBookToInventory(book4);
        library.addBookToInventory(book5);
    }

    @Test
    public void canCountBooksInInventory(){
        assertEquals(5, library.numOfBooksInInventory());
    }

    @Test
    public void canAddBookToInventory(){
        Book book = new Book("The Shining", "Stephen King", "Horror");
        library.addBookToInventory(book);
        assertEquals(6, library.numOfBooksInInventory());
    }

    @Test
    public void canSearchForTitleTrue(){
        assertEquals(true, library.searchInventory("The Institute"));
    }
    @Test
    public void canSearchForTitleFalse(){
        assertEquals(false, library.searchInventory("The Stand"));
    }

    @Test
    public void hashMapOfInventory(){
        HashMap<String, Integer> answer = new HashMap<>();
        answer.put("Horror", 2);
        answer.put("Romance", 1);
        answer.put("Science Fiction", 2);
        assertEquals(answer, library.getInventoryByGenre());
    }
}
