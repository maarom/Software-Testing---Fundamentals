package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){
        //give
        Calculator testObj = new Calculator();

        //when
        int actual = testObj.add(3,5);

        //then
        assertEquals(8,actual);
    }

    //Happy path test
    @Test
    void testDivide() {
        //give
        Calculator testObj = new Calculator();

        //when
        int actual = testObj.divide(8,2);

        //then
        assertEquals(4,actual);
    }

    @Test
    void testDivideByZeroItShouldReturnNegativeOne(){
        Calculator testObj = new Calculator();

        int actualResult = testObj.divide(8,0);
        assertEquals(-1,actualResult);

    }

    // TODO: Read more about T.D.D (Test Driven Development)
    // TODO: Read more about Test Pyramid

}
