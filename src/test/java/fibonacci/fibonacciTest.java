package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fibonacciTest {
    private fibonacci fib;

    @BeforeEach
    public void setup(){
        fib = new fibonacci();
    }

    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fib.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        int obtainedValue = fib.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturn89IfTheNumberIs11(){
        int expectedValue = 89;
        int obtainedValue = fib.compute(11);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fib.compute(-1));
    }

    @Test
    public void shouldComputeOfABigNumberRaiseAnException(){
        assertThrows(RuntimeException.class, () -> fib.compute(Integer.MAX_VALUE));
    }
}