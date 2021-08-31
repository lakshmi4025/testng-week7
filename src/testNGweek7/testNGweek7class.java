package testNGweek7;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class testNGweek7class {
	  @Test
	  public void f() {
		  System.out.println("test phase");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test phase");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test phase");
	  }

	}

