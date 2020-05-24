package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_itself_when_given_normal_numbers(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("1",fb.sayNumbers(1));
        Assert.assertEquals("4",fb.sayNumbers(4));
    }

    @Test
    public void should_return_fizz_when_given_multiple_of_3(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.sayNumbers(6));
        Assert.assertEquals("Fizz",fb.sayNumbers(12));
    }

    @Test
    public void should_return_buzz_when_given_multiple_of_5(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Buzz",fb.sayNumbers(10));
        Assert.assertEquals("Buzz",fb.sayNumbers(20));
    }

    @Test
    public void should_return_whizz_when_given_multiple_of_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Whizz",fb.sayNumbers(14));
        Assert.assertEquals("Whizz",fb.sayNumbers(28));
    }

    @Test
    public void should_return_fizzbuzz_when_given_multiple_of_3_and_5(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("FizzBuzz",fb.sayNumbers(15));
        Assert.assertEquals("FizzBuzz",fb.sayNumbers(30));
    }

    @Test
    public void should_return_fizzwhizz_when_given_multiple_of_3_and_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("FizzWhizz",fb.sayNumbers(21));
        Assert.assertEquals("FizzWhizz",fb.sayNumbers(42));
    }

    @Test
    public void should_return_buzzwhizz_when_given_multiple_of_5_and_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("BuzzWhizz",fb.sayNumbers(35));
        Assert.assertEquals("BuzzWhizz",fb.sayNumbers(70));
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_given_multiple_of_3_and_5_and_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("FizzBuzzWhizz",fb.sayNumbers(105));
        Assert.assertEquals("FizzBuzzWhizz",fb.sayNumbers(210));
    }
}
