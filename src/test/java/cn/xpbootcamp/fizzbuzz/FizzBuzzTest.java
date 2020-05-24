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

}
