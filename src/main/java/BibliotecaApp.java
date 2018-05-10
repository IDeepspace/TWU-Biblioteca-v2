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

    Bookstore bookstore = new Bookstore(bookList(), printStream, inputReader,checkOutBookList(), movieList(), checkOutMovies(), userList());

    Menu menu = new Menu(bookstore, printStream, inputReader);

    Welcome welcome = new Welcome(printStream);
    welcome.sayWelcome();

    int index = bookstore.getUserLoginInfomation();

    menu.selectOption(index);
  }

  //book
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

  //movie
  public static List<Movie> movieList() {
    List<Movie> movieList = new ArrayList<>();
    Movie movie1 = new Movie("movie1", "2015", "ZhangYimou", 5);
    movieList.add(movie1);
    Movie movie2 = new Movie("movie2", "2016", "ChenKaige", 4);
    movieList.add(movie2);
    return movieList;
  }

  public static List<Movie> checkOutMovies() {
    List<Movie> checkOutMovies = new ArrayList<>();
    return checkOutMovies;
  }

  //user
  public static List<User> userList() {
    List<User> userList = new ArrayList<User>();

    User user1 = new User("user1", "user1@qq.com", "11111111111", "u1", "111");
    User user2 = new User("user2", "user2@qq.com", "22222222222", "u2", "222");
    userList.add(user1);
    userList.add(user2);

    return userList;
  }
}
