package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        //int result = calculator.add(4, 5);
        assertEquals(9, calculator.add(4, 5), "4 + 5 should equal 9");
    }
    @Test
    public void testAddnew() {
        Calculator calculator = new Calculator();
        //int result = calculator.addnew(5, 3);
        assertEquals(2, calculator.addnew(5, 3),"5 - 3 should equal 2");
    }
    @Test
    public void div() {
        Calculator calculator = new Calculator();
        //int result = calculator.div(5, 0);
        assertThrows(ArithmeticException.class,()->{
            calculator.div(5, 0);
        },"Division by zero should throw ArithmeticException");
    }
}
