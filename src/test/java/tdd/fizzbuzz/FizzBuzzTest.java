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

    @Test
    public void should_output_2_when_count_off_and_order_is_2() throws Exception {
        order = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("2");
    }

    @Test
    public void should_output_Fizz_when_count_off_and_order_is_3() throws Exception {
        order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Fizz");
    }

    @Test
    public void should_output_4_when_count_off_and_order_is_4() throws Exception {
        order = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("4");
    }

    @Test
    public void should_output_Buzz_when_count_off_and_order_is_5() throws Exception {
        order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Buzz");
    }

    @Test
    public void should_output_Fizz_when_count_off_and_order_is_6() throws Exception {
        order = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Fizz");
    }

    @Test
    public void should_output_Whizz_when_count_off_and_order_is_7() throws Exception {
        order = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Whizz");
    }

    @Test
    public void should_output_8_when_count_off_and_order_is_8() throws Exception {
        order = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("8");
    }

    @Test
    public void should_output_Fizz_when_count_off_and_order_is_9() throws Exception {
        order = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Fizz");
    }

    @Test
    public void should_output_Buzz_when_count_off_and_order_is_10() throws Exception {
        order = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Buzz");
    }

    @Test
    public void should_output_11_when_count_off_and_order_is_11() throws Exception {
        order = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("11");
    }

    @Test
    public void should_output_Fizz_when_count_off_and_order_is_12() throws Exception {
        order = 12;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("Fizz");
    }

    @Test
    public void should_output_13_when_count_off_and_order_is_13() throws Exception {
        order = 13;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.countOff(order);
        assertThat(actualResult).isEqualTo("13");
    }
}
