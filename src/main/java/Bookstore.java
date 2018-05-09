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

  public void displayBookList() {
    for (int i = 1; i <= bookList.size(); i++) {
      printStream.print(i + ". ");
      printStream.println(bookList.get(i - 1).detailInfo());
    }
  }

  public void checkoutBook() {
    printStream.println("Which book would you like to check out?");

    displayBookList();

    String userInput = inputReader.getUserInput();
    int index = Integer.parseInt(userInput) - 1;
    if (index >= 0 && index < bookList.size()) {
      Book book = bookList.remove(index);
      checkOutBooks.add(book);
      printStream.println("Thank you! Enjoy your book.");
    } else {
      printStream.println("That book is not available.");
    }
  }

  public void returnBook() {
    printStream.println("Which book would you want to return?");
    displayBookList();
    String userInput = inputReader.getUserInput();
    int index = Integer.parseInt(userInput) - 1;
    if (index >= 0 && index < checkOutBooks.size()) {
      Book book = checkOutBooks.remove(index);
      bookList.add(book);
      printStream.println("Thank you for returning the book.");
    } else {
      printStream.println("That is not a valid book to return.");
    }
  }
}
