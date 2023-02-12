package com.example.Jenkinsdemo;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsdemoApplicationTests {


	@Test                                               
	public void checkNumTest() {
	    int num1 = -20;
	    assertFalse("Number is not greater than 0",num1>0);
	}

}
