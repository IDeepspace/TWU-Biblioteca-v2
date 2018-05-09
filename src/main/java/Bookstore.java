import java.io.PrintStream;
import java.util.List;

public class Bookstore {

  private List<Book> bookList;
  private List<Book> checkOutBooks;
  private PrintStream printStream;
  private InputReader inputReader;

  public Bookstore(List<Book> bookList, PrintStream printStream, InputReader inputReader, List<Book> checkOutBooks) {
    this.bookList = bookList;
    this.printStream = printStream;
    this.inputReader = inputReader;
    this.checkOutBooks = checkOutBooks;
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
