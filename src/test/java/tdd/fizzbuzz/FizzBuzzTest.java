package tdd.fizzbuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private Integer order;

    @Test
    public void should_return_order_when_count_off_given_order_number_with_normal_case() throws Exception {
        //given
        order = 19;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = order.toString();
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_Fizz_when_count_off_given_order_number_with_multiples_3() throws Exception {
        //given
        order = 12;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_with_multiples_5() throws Exception {
        //given
        order = 25;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_Whizz_when_count_off_given_order_number_with_multiples_7() throws Exception {
        //given
        order = 49;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Whizz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_with_multiples_3_5() throws Exception {
        //given
        order = 15;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_FizzWhizz_when_count_off_given_order_number_with_multiples_3_7() throws Exception {
        //given
        order = 21;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzWhizz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_BuzzWhizz_when_count_off_given_order_number_with_multiples_5_7() throws Exception {
        //given
        order = 35;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "BuzzWhizz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_count_off_given_order_number_with_multiples_3_5_7() throws Exception {
        //given
        order = 105;

        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzzWhizz";
        String actualResult = fizzBuzz.countOff(order);

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
