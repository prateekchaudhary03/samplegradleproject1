package co.igorski;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("IT")
class SimpleCalculatorIT {

    private final AdvancedCalculator calculator = new ScientificCalculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(calculator.add(1,2), 3);
    }

    @Test
    void shouldSubstractTwoNumbers() {
        assertEquals(calculator.substract(5,2), 3);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(calculator.multiply(3,1), 3);
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(calculator.divide(6,2), 3);
    }
}