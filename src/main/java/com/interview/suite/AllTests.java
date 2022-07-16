package com.interview.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import com.interview.tasks.TaskEight;
import com.interview.tasks.TaskFive;
import com.interview.tasks.TaskFour;
import com.interview.tasks.TaskNine;
import com.interview.tasks.TaskOne;
import com.interview.tasks.TaskSeven;
import com.interview.tasks.TaskSix;
import com.interview.tasks.TaskTen;
import com.interview.tasks.TaskThree;
import com.interview.tasks.TaskTwo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaskOne.class,
	TaskTwo.class,
	TaskThree.class,
	TaskFour.class,
	TaskFive.class,
	TaskSix.class,
	TaskSeven.class,
	TaskEight.class,
	TaskNine.class,
	TaskTen.class

})
public class AllTests {}

class SuiteRunner {
	public static void main( String[] args ) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			}

			System.out.println();
			System.out.println("Test Suite execution was successful: " + result.wasSuccessful());
    }
}