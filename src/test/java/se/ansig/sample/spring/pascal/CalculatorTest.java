package se.ansig.sample.spring.pascal;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {

    @Test
    public void calculateNthPascalRow() {
        assertThat(Calculator.pascalRow(1), contains(1));
        assertThat(Calculator.pascalRow(2), contains(1, 1));
        assertThat(Calculator.pascalRow(3), contains(1, 2, 1));
        assertThat(Calculator.pascalRow(4), contains(1, 3, 3, 1));
        assertThat(Calculator.pascalRow(5), contains(1, 4, 6, 4, 1));
        assertThat(Calculator.pascalRow(6), contains(1, 5, 10, 10, 5, 1));
        assertThat(Calculator.pascalRow(7), contains(1, 6, 15, 20, 15, 6, 1));
        assertThat(Calculator.pascalRow(8), contains(1, 7, 21, 35, 35, 21, 7, 1));
        assertThat(Calculator.pascalRow(9), contains(1, 8, 28, 56, 70, 56, 28, 8, 1));
        assertThat(Calculator.pascalRow(10), contains(1, 9, 36, 84, 126, 126, 84, 36, 9, 1));
    }
}
