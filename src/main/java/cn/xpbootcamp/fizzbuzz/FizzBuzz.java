package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String sayNumbers(int num) {
        String result = "";
        if ( num % 3 == 0){
            result += "Fizz";
        }
        if ( num % 5 == 0){
            result += "Buzz";
        }
        if ( num % 7 == 0){
            result += "Whizz";
        }
        if (result.equals("")) {
            result = String.valueOf(num);
        }
        return result;
    }
}
