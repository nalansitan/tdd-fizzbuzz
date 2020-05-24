package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String sayNumbers(int num) {
        if ( num % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
