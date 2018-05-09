import java.io.PrintStream;

public class Welcome {

  private PrintStream printStream;

  public Welcome(PrintStream printStream) {
    this.printStream = printStream;
  }


  public void sayWelcome() {
    printStream.println("Welcome to the biblioteca!");
  }

}