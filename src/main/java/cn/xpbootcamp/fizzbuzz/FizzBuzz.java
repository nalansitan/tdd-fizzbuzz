package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    static String FIZZ = "Fizz";
    static String BUZZ = "Buzz";
    static String WHIZZ = "Whizz";
    public String sayNumbers(int inputNum) {
        String result = "";
        if ( inputNum % 3 == 0){
            result += FIZZ;
        }
        if ( inputNum % 5 == 0){
            result += BUZZ;
        }
        if ( inputNum % 7 == 0){
            result += WHIZZ;
        }
        if (result.equals("")) {
            result = String.valueOf(inputNum);
        }
        return result;
    }
}
