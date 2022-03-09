package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class RobotClass
{
  @Test
  public void f() throws Exception
  {
	  Robot rb=new Robot();
	  rb.mouseMove(1025, 470);
	  rb.delay(3000);
	  //rb.mousePress(InputEvent. BUTTON1_DOWN_MASK);
	  //rb.mouseRelease(InputEvent. BUTTON1_DOWN_MASK);
	  rb.delay(3000);
	  System.out.println(1);
	  System.out.println(rb.toString());
	  System.out.println(1);
  }
}
