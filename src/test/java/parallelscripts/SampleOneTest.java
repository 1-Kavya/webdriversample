package parallelscripts;

import org.testng.annotations.Test;

public class SampleOneTest {
	
	  @Test
	  public void testOne() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 11 in SampleOne....."+id);
	  	}
	  
	  @Test
	  public void testTwo() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 12 in SampleOne....."+id);
		  
	  	}

	  @Test
	  public void testThree() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 13 in SampleOne....."+id);
		  
	  	}
	 
	  @Test
	  public void testFour() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 14 in SampleOne....."+id);
		  
	  	}  

	}
