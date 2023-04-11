import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    @Before
    public void setup() {
        book = new Book("The Institute", "Stephen King", "Horror");
    }

    @Test
    public void bookHasTitleAuthorAndGenre(){
        assertEquals("The Institute", book.getTitle());
        assertEquals("Stephen King", book.getAuthor());
        assertEquals("Horror", book.getGenre());
    }



}
