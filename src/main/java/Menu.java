import java.io.PrintStream;

public class Menu {

  private Bookstore bookstore;
  private PrintStream printStream;
  private InputReader inputReader;

  public Menu(Bookstore bookstore, PrintStream printStream, InputReader inputReader) {
    this.bookstore = bookstore;
    this.printStream = printStream;
    this.inputReader = inputReader;
  }

  public void displayMenu() {
    printStream.println("------------------------");
    printStream.println("Please select an option:");
    printStream.println("1. List Books");
    printStream.println("2. Checkout Book");
    printStream.println("3. Return Book");
    printStream.println("0. Quit");
    printStream.println("-------------------------");
  }

  public void selectOption() {
    displayMenu();

    String input = inputReader.getUserInput();

    while (!input.equals("0")) {
      if (input.equals("1")) {
        bookstore.displayBookList();
      } else if (input.equals("2")) {
        bookstore.checkoutBook();
      } else if (input.equals("3")) {
        bookstore.returnBook();
      } else {
        printStream.println("Select a valid option!");
      }
      displayMenu();
      input = inputReader.getUserInput();
    }

  }

}
