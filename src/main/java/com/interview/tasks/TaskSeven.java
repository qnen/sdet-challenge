package com.interview.tasks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TaskSeven {

	@Test
	public void TaskSeven() {
		// Step 0
		String text = "CODE";
		assertTrue(text.equalsIgnoreCase("CODE"));
		
		// Step 1
		String textStepTwo = text.replaceAll(".", "$0$0");
		assertTrue(textStepTwo.equalsIgnoreCase("CCOODDEE"));

		// Step 2
		String textStepThree = new StringBuilder(textStepTwo).reverse().toString();
		assertTrue(textStepThree.equalsIgnoreCase("EEDDOOCC"));
		
		// Step 3
		String textStepFour = new StringBuilder(textStepThree).deleteCharAt(textStepThree.length() - 1).toString();
		assertTrue(textStepFour.equalsIgnoreCase("EEDDOOC"));
	}
}
