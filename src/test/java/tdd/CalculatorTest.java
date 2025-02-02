package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator instance = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Adding two numbers")
    void testAdd(){
        //Arrange
        int number1 = 3;
        int number2 = 5;
        int expected = 8;

        //Act
        int result = instance.add(number1, number2);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Subtracting two numbers")
    void testSubtract(){
        //Arrange

        int number1 = 20;
        int number2 = 10;
        int expected = 10;

        //Act
        int result = instance.subtract(number1, number2);

        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Multiplying two numbers")
    void testMultiply(){
        //Arrange
        int number1 = 10;
        int number2 = 5;
        int expected = 50;

        //Act

        int result = instance.multiply(number1, number2);

        //Assert

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Dividing two numbers")
    void testDivide(){
        //Arrange
        int number1 = 100;
        int number2 = 10;
        int expected = 10;

        //Act
        int result = instance.divide(number1, number2);

        //Assert

        assertEquals(expected, result);



    }


}