package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(Integer order) {
        String output = "";
        if (order % 3 == 0) {
            output += "Fizz";
        }
        if (order % 5 == 0) {
            output += "Buzz";
        }
        if (order % 7 == 0) {
            output += "Whizz";
        }
        if (!output.equals("")) {
            return output;
        } else {
            return order.toString();
        }
    }
}
