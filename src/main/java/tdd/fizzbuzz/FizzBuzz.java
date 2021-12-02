package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(Integer order) {
        if (order % 3 == 0) {
            return "Fizz";
        } else {
            return order.toString();
        }
    }
}
