package com.virtusa.test.codetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.virtusa.codetest.NumberUtils;

public class NumberUtilsTest {
	
		@BeforeClass
	    public static void beforeClass() {
	        System.out.println("Before Class");
	    }
	 
	    @Before
	    public void before() {
	        System.out.println("Before Test Case");
	    }
	 
	    @Test
	    public void isPositiveNumber() {
	        System.out.println("Convert positive  number into word");
	        assertEquals(NumberUtils.numberToWord(123),"one hundred twenty-three");
	    }
	 
	    
	    @Test
	    public void isNegetiveNumber() {
	        System.out.println("Convert negative  number into word");
	        assertEquals(NumberUtils.numberToWord(-123),"minus one hundred twenty-three");
	    }
	    
	    @Test
	    public void isMaxDigits() {
	        System.out.println("Convert maximum  number into word");
	        assertEquals(NumberUtils.numberToWord(999999999),"nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine");
	    }
	    
	    
	    @After
	    public void after() {
	        System.out.println("After Test Case");
	    }
	 
	    @AfterClass
	    public static void afterClass() {
	        System.out.println("After Class");
	    }

}
