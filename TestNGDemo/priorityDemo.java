package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityDemo {
  @Test(priority = 0)
  public void first() {
	  System.out.println("The thread ID for priority is "+ Thread.currentThread().getId());
	  System.out.println("First");
  }
  @Test(priority = 1)
  public void second() {
	  System.out.println("Second");
  }
  @Test(priority = 2)
  public void third() {
	  System.out.println("Third");
  }
  @Test(priority = 3, enabled = false)
  public void fourth() {
	  System.out.println("Fourth");
  }
  @Test(priority = -1)
  public void fifth() {
	  System.out.println("Fifth");
	  Assert.assertEquals(false, true);
  }
  
}
