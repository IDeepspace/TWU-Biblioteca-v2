import java.io.PrintStream;
import java.util.List;

public class Bookstore {

  private List<Book> bookList;
  private PrintStream printStream;

  public Bookstore(List<Book> bookList, PrintStream printStream) {
    this.bookList = bookList;
    this.printStream = printStream;
  }

  public void printBooks() {
    for (Book book : bookList) {
      printStream.println(book.detailInfo());
    }
  }

  public void displayBookList() {
  }

  public void checkoutBook() {
  }

  public void returnBook() {
  }
}
