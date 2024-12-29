package test;

import org.testng.annotations.Test;

public class Day1 {
   @Test(groups= {"smoke"})
	public void demo(){
		System.out.println("hello");
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello4");
		System.out.println("hello3");
	}
   
   @Test
  public void secondtest() {
	   System.out.println("hii");
	   System.out.println("hii1");
   }
   @Test
   public void secondtest1() {
 	   System.out.println("second");
 	   System.out.println("second1");
    }
}
