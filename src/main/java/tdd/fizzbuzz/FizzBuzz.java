package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(Integer order) {
        if (order % 3 == 0) {
            return "Fizz";
        } if (order % 5 == 0) {
            return "Buzz";
        } else {
            return order.toString();
        }
    }
}
