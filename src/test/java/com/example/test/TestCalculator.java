package com.example.test;

// xunit -> junit, jsunit, pyunit, cunit
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*

* Application SRS:
    1. 2가지의 숫자의정수 덧셈
    2. 2가지의 숫자의 정수 뺄셈
 */

public class TestCalculator {
    // annotation -> 부가 설명, 기능을 코드 없이 설명
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        int result = cal.add(10,20);
        assertTrue(result == 30);
//        Assertions.assertTrue(result==30);

    }
    @Test
    public void testSubstract(){
        Calculator cal = new Calculator();
        int result = cal.substract(20,10);
        assertTrue(result==10);
    }

    @Test
    public void testAddError(){
        Calculator cal = new Calculator();
        int result = cal.add(20,10);
        assertFalse(result == 30);
    }

    @Test
    public void testSubstractError(){
        Calculator cal = new Calculator();
        int result = cal.add(20,10);
        assertEquals(10,result);
    }
}
