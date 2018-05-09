import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.IOException;

public class InputReader {

  private PrintStream printStream;
  private BufferedReader bufferedReader;

  public InputReader(java.io.PrintStream printStream, java.io.BufferedReader bufferedReader) {
    this.printStream = printStream;
    this.bufferedReader = bufferedReader;
  }

  public String getUserInput() {
    String userInput = "";
    try {
      userInput = bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    printStream.println();
    return userInput;
  }

}
