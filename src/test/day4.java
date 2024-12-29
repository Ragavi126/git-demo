package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 {
	@AfterTest
	public void Aftertest() {
		System.out.println("execulte last");
	}
	@Test
	public void Mobilehomeloan() {
		System.out.println("homelogin");
	}

}
