package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(Integer order) {
        if (order % 3 == 0) {
            return "Fizz";
        } if (order % 5 == 0) {
            return "Buzz";
        } else if (order % 7 == 0) {
            return "Whizz";
        } else {
            return order.toString();
        }
    }
}
