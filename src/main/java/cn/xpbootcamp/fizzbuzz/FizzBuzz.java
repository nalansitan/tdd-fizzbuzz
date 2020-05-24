package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    static String FIZZ = "Fizz";
    static String BUZZ = "Buzz";
    static String WHIZZ = "Whizz";
    public String sayNumbers(int num) {
        String result = "";
        if ( num % 3 == 0){
            result += FIZZ;
        }
        if ( num % 5 == 0){
            result += BUZZ;
        }
        if ( num % 7 == 0){
            result += WHIZZ;
        }
        if (result.equals("")) {
            result = String.valueOf(num);
        }
        return result;
    }
}
