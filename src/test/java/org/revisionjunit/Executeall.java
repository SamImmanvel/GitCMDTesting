package org.revisionjunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({revemp.class,cmp.class})
public class Executeall {
	@Test
	public void tc1() {
Result res = JUnitCore.runClasses(revemp.class,cmp.class);
System.out.println("getruncount:"+res.getRunCount());
System.out.println("getfailurecount:"+res.getFailureCount());
System.out.println("getignorecount"+res.getIgnoreCount());
	int passcount=res.getRunCount()-res.getFailureCount();
	System.out.println("passcount:"+passcount);
	List<Failure> failures = res.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
		
	}
	
	}

}
