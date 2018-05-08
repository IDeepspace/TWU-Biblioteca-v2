
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeTest {

  private PrintStream printStream;
  private Welcome welcome;

  @Before
  public void set_up () throws  Exception{
    printStream = mock(PrintStream.class);
    welcome = new Welcome(printStream);
  }

  @Test
  public void sayWelcome() {
    welcome.sayWelcome();
    verify(printStream).println("Welcome to the biblioteca!");
  }
}