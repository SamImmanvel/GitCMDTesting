package org.revisionjunit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class revemp {

	
	@Test
	public void tc1() {
System.out.println("test1");
	}
	@Ignore
	@Test
	public void tc2() {
System.out.println("test2");
	}
	@Test
	public void tc3() {
System.out.println("test3");
	}
}
