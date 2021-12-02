package tdd.fizzbuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private Integer order;

    @Test
    public void should_output_1_when_count_off_and_order_is_1() throws Exception {
        order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("1");
    }
}
