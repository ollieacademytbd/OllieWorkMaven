package com.qa.questionstest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.questions.questions;

public class questionTest {
	
	questions q = new questions();
	
	@Test
	public void letsMultiplyTets() {
		assertEquals(100, q.letMul(2, 50));
	}
	
	
	

}
