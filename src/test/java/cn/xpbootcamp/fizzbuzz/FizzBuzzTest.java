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

}
