package TestNg1;

import org.testng.annotations.*;

public class TestNg2 {
	
	@Parameters({"URL","URLT"})
	@Test
	public void CthirdTest(String catched,String second) {
		System.out.println("This is third test");
		System.out.println(catched);
		System.out.println(second);
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
