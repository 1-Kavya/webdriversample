package parallelscripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
  @Test
  public void testOne() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 21 in SampleTwo....."+id);
  	}
  
  @Test
  public void testTwo() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 22 in SampleTwo....."+id);
	  
  	}

  @Test
  public void testThree() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 23 in SampleTwo....."+id);
	  
  	}
 
  @Test
  public void testFour() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 24 in SampleTwo....."+id);
	  
  	}  

}
