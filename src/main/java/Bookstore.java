import java.io.PrintStream;
import java.util.List;

public class Bookstore {

  private List<Book> bookList;
  private List<Book> checkOutBooks;
  private List<Movie> movieList;
  private List<Movie> checkOutMovies;
  private List<User> userList;
  private PrintStream printStream;
  private InputReader inputReader;

  public Bookstore(List<Book> bookList, PrintStream printStream, InputReader inputReader, List<Book> checkOutBooks, List<Movie> movieList, List<Movie> checkOutMovies, List<User> userList) {
    this.bookList = bookList;
    this.printStream = printStream;
    this.inputReader = inputReader;
    this.checkOutBooks = checkOutBooks;
    this.movieList = movieList;
    this.checkOutMovies = checkOutMovies;
    this.userList = userList;
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

  //movie
  public void displayMovieList() {
    for (int i = 1; i <= movieList.size(); i++) {
      printStream.print(i + ". ");
      printStream.println(movieList.get(i - 1).getMovieDetail());
    }
  }

  public void checkoutMovie() {
    printStream.println("Which movie would you like to check out?");

    displayMovieList();

    String userInput = inputReader.getUserInput();
    int index = Integer.parseInt(userInput) - 1;
    if (index >= 0 && index < movieList.size()) {
      Movie movie = movieList.remove(index);
      checkOutMovies.add(movie);
      printStream.println("Thank you! Enjoy your movie.");
    } else {
      printStream.println("That movie is not available.");
    }
  }

  public void returnMovie() {
    printStream.println("Which movie would you want to return?");
    displayMovieList();
    String userInput = inputReader.getUserInput();
    int index = Integer.parseInt(userInput) - 1;
    if (index >= 0 && index < checkOutMovies.size()) {
      Movie movie = checkOutMovies.remove(index);
      movieList.add(movie);
      printStream.println("Thank you for returning the movie.");
    } else {
      printStream.println("That is not a valid movie to return.");
    }
  }

  public int getUserLoginInfomation() {
    printStream.print("Please input your library_number:");
    String library_number = inputReader.getUserInput();
    printStream.print("Please input your password:");
    String password = inputReader.getUserInput();
    int index = findUsersByLibraryNumberAndPassword(library_number, password);
    return index;
  }

  public int findUsersByLibraryNumberAndPassword(String library_number, String password) {
    int i = 0;
    int index = -1;
    for (User user : userList) {
      if (user.checkVoucher(library_number, password)) {
        index = i;
      }else {
        i ++;
      }
    }
    return index;
  }

  public void displayUserInformation(int index) {
    printStream.println(userList.get(index).getUserDetailInfo());
  }
}
