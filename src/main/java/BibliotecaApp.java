import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
  public static void main(String[] args) {

    PrintStream printStream = System.out;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(in);

    InputReader inputReader = new InputReader(printStream, reader);

    Bookstore bookstore = new Bookstore(bookList(), printStream, inputReader,checkOutBookList(), movieList, checkOutMovies, userList);

    Menu menu = new Menu(bookstore, printStream, inputReader);

    Welcome welcome = new Welcome(printStream);
    welcome.sayWelcome();

    menu.selectOption();
  }

  public static List<Book> bookList() {
    List<Book> bookList = new ArrayList<>();
    Book book1 = new Book("book1", "xiaoMing", 2015);
    bookList.add(book1);
    Book book2 = new Book("book2", "xiaoHong", 2016);
    bookList.add(book2);
    return bookList;
  }

  public static List<Book> checkOutBookList() {
    List<Book> checkOutBookList = new ArrayList<>();
    return checkOutBookList;
  }
}
