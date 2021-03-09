
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void SquarerootTruePositive(){
        assertEquals("Square root for True Positive", 9, calculator.Square_root(81), DELTA);
        assertEquals("Square root for True Positive", 4.0, calculator.Square_root(16.0), DELTA);
    }

    @Test
    public void SquarerootFalsePositive(){
        assertNotEquals("Square root for False Positive", 8, calculator.Square_root(81), DELTA);
        assertNotEquals("Square root for False Positive", 7.0, calculator.Square_root(12.0), DELTA);
    }

    /*@Test
    public void FactorialTruePositive(){
        assertEquals("Factorial for True Positive",6, calculator.Fact(3),DELTA);
        assertEquals("Factorial for True Positive",120, calculator.Fact(5), DELTA);

    }


    @Test
    public void FactorialFalsePositive(){
        assertNotEquals("Factorial for False Positive",7,calculator.Fact(3),DELTA);
        assertNotEquals("Factorial for False Positive",120,calculator.Fact(7),DELTA);
    }


    @Test
    public void NaturallogrithmTruePositive(){
        assertEquals("Natural logrithm for True Positive", assertEquals("Natural logrithm for True Positive",
    }

    @Test
    public void NaturallogrithmFalsePositive(){
        assertNotEquals("Natural logrithm for False Positive",
                assertNotEquals("Natural logrithm for False Positive",
    }*/

    @Test
    public void PowerTruePositive(){
        assertEquals("Power for True Positive", 8, calculator.Power(2,3), DELTA);
        assertEquals("Power for True Positive", 27.0 , calculator.Power(3,3),DELTA);
    }

    @Test
    public void PowerTrueNegative(){
        assertNotEquals("Power for True Negative",5, calculator.Power(2,3), DELTA);
        assertNotEquals("Power for True Negative",35.0,calculator.Power(4,3), DELTA);
    }
    }

