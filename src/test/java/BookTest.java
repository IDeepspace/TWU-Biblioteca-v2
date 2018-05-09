import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class BookTest {

  private Book book;

  @Before
  public void setup() {
    book = new Book("The Power of Habit", "Charles Duhigg", 2013);
  }

  @Test
  public void should_book_have_name_author_publishedYear() {
    assertEquals(book.detailInfo(), "The Power of Habit, Charles Duhigg, 2013\n");
  }

}