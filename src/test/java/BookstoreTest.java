import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookstoreTest {

  private PrintStream printStream;
  private List<Book> bookList;
  private Bookstore bookstore;
  private Book book;

  @Before
  public void setUp() throws Exception {

    printStream = mock(PrintStream.class);
    bookList = new ArrayList<>();
    book = mock(Book.class);

    bookstore = new Bookstore(bookList, printStream);

  }

  @Test
  public void should_print_book_list() {
    Book book = mock(Book.class);
    bookList.add(book);
    bookstore.printBooks();
    for (Book item : bookList) {
      verify(book).detailInfo();
    }
  }

}