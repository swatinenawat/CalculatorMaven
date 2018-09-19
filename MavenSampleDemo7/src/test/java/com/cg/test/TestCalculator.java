package com.cg.test;



import org.junit.Assert;
import org.junit.Test;

import com.cg.bean.Calculator;

public class TestCalculator 
{
	@Test
	public void test_add()
	{
		Calculator calc=new Calculator();
		int res=calc.add(3,4);
		Assert.assertEquals(7,res);
	}
	@Test
	public void test_multiply()
	{
		Calculator calc=new Calculator();
		int res=calc.multiply(2,4);
		Assert.assertEquals(8,res);
	}
	@Test
	public void test_sub()
	{
		Calculator calc=new Calculator();
		int res=calc.subtract(10,8);
		Assert.assertEquals(2,res);
	}
	@Test
	public void test_square()
	{
		Calculator calc=new Calculator();
		int res=calc.calSquare(3);
		Assert.assertEquals(9,res);
	}
	
	
	
}
