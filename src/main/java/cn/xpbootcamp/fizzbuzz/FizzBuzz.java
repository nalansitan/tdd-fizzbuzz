package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String sayNumbers(int num) {
        if ( num % 3 == 0){
            return "Fizz";
        }
        if ( num % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
