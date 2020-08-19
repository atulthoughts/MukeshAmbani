package TestNg1;

import org.testng.annotations.*;

public class TestNg3 {
	
	@Test
	public void CthirdTest() {
		System.out.println("This is third test");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	
	@Test
	public void DforthTest() {
		System.out.println("This is forth test");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Whosoever i am the first");
	}

}
