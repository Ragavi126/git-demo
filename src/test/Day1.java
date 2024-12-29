package test;

import org.testng.annotations.Test;

public class Day1 {
   @Test(groups= {"smoke"})
	public void demo(){
		System.out.println("hello");
		System.out.println("hello1");
		System.out.println("hello2");
	}
   
   @Test
  public void secondtest() {
	   System.out.println("hii");
   }
}
