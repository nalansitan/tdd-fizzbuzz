package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void when_give_a_num_then_say_num(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("1",fb.SayNumbers(1));
        Assert.assertEquals("2",fb.SayNumbers(2));
        Assert.assertEquals("4",fb.SayNumbers(4));
    }

    @Test
    public void when_give_a_num_divided_by_3_5_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.SayNumbers(3));
        Assert.assertEquals("Fizz",fb.SayNumbers(6));
        Assert.assertEquals("Buzz",fb.SayNumbers(5));
        Assert.assertEquals("Buzz",fb.SayNumbers(10));
        Assert.assertEquals("Whizz",fb.SayNumbers(7));
        Assert.assertEquals("Whizz",fb.SayNumbers(14));
    }

    @Test
    public void when_give_a_num_divided_by_many_nums(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("FizzBuzz",fb.SayNumbers(60));
        Assert.assertEquals("FizzWhizz",fb.SayNumbers(21));
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(140));
        Assert.assertEquals("FizzBuzzWhizz",fb.SayNumbers(210));
    }

    @Test
    public void when_give_a_num_contain_3(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.SayNumbers(13));
        Assert.assertEquals("Fizz",fb.SayNumbers(30));
    }

    @Test
    public void when_give_a_num_contain_5(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(35));
        Assert.assertEquals("Buzz",fb.SayNumbers(50));
        Assert.assertEquals("BuzzWhizz",fb.SayNumbers(105));
    }

    @Test
    public void when_give_a_num_contain_7(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals("Fizz",fb.SayNumbers(75));
        Assert.assertEquals("Fizz",fb.SayNumbers(57));
        Assert.assertEquals("FizzWhizz",fb.SayNumbers(357));
        Assert.assertEquals("Fizz",fb.SayNumbers(37));
    }

    @Test
    public void all_test(){
        FizzBuzz fb = new FizzBuzz();
        Assert.assertEquals( "1",fb.SayNumbers(1));
        Assert.assertEquals( "4",fb.SayNumbers(4));
        Assert.assertEquals( "Fizz",fb.SayNumbers(6));
        Assert.assertEquals( "Buzz",fb.SayNumbers(10));
        Assert.assertEquals( "Whizz",fb.SayNumbers(14));
        Assert.assertEquals( "FizzBuzz",fb.SayNumbers(60));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(21));
        Assert.assertEquals( "BuzzWhizz",fb.SayNumbers(140));
        Assert.assertEquals( "FizzBuzzWhizz",fb.SayNumbers(210));
        Assert.assertEquals( "Fizz",fb.SayNumbers(13));
        Assert.assertEquals( "Fizz",fb.SayNumbers(3));
        Assert.assertEquals( "Fizz",fb.SayNumbers(130));
        Assert.assertEquals( "Fizz",fb.SayNumbers(133));
        Assert.assertEquals( "Fizz",fb.SayNumbers(30));
        Assert.assertEquals( "Fizz",fb.SayNumbers(63));
        Assert.assertEquals( "Fizz",fb.SayNumbers(1330));
        Assert.assertEquals( "Fizz",fb.SayNumbers(630));
        Assert.assertEquals( "52",fb.SayNumbers(52));
        Assert.assertEquals( "51",fb.SayNumbers(51));
        Assert.assertEquals( "Buzz",fb.SayNumbers(5));
        Assert.assertEquals( "Whizz",fb.SayNumbers(56));
        Assert.assertEquals( "Buzz",fb.SayNumbers(15));
        Assert.assertEquals( "Whizz",fb.SayNumbers(252));
        Assert.assertEquals( "BuzzWhizz",fb.SayNumbers(245));
        Assert.assertEquals( "BuzzWhizz",fb.SayNumbers(105));
        Assert.assertEquals( "17",fb.SayNumbers(17));
        Assert.assertEquals( "Fizz",fb.SayNumbers(27));
        Assert.assertEquals( "170",fb.SayNumbers(170));
        Assert.assertEquals( "Whizz",fb.SayNumbers(7));
        Assert.assertEquals( "Fizz",fb.SayNumbers(270));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(147));
        Assert.assertEquals( "Whizz",fb.SayNumbers(70));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(1470));
        Assert.assertEquals( "53",fb.SayNumbers(53));
        Assert.assertEquals( "153",fb.SayNumbers(153));
        Assert.assertEquals( "Buzz",fb.SayNumbers(235));
        Assert.assertEquals( "Whizz",fb.SayNumbers(532));
        Assert.assertEquals( "Buzz",fb.SayNumbers(135));
        Assert.assertEquals( "Whizz",fb.SayNumbers(1533));
        Assert.assertEquals( "BuzzWhizz",fb.SayNumbers(35));
        Assert.assertEquals( "BuzzWhizz",fb.SayNumbers(315));
        Assert.assertEquals( "Fizz",fb.SayNumbers(37));
        Assert.assertEquals( "Fizz",fb.SayNumbers(73));
        Assert.assertEquals( "Fizz",fb.SayNumbers(237));
        Assert.assertEquals( "Fizz",fb.SayNumbers(370));
        Assert.assertEquals( "Fizz",fb.SayNumbers(371));
        Assert.assertEquals( "Fizz",fb.SayNumbers(2370));
        Assert.assertEquals( "Fizz",fb.SayNumbers(378));
        Assert.assertEquals( "Fizz",fb.SayNumbers(3710));
        Assert.assertEquals( "Fizz",fb.SayNumbers(2370));
        Assert.assertEquals( "157",fb.SayNumbers(157));
        Assert.assertEquals( "Fizz",fb.SayNumbers(57));
        Assert.assertEquals( "275",fb.SayNumbers(275));
        Assert.assertEquals( "Whizz",fb.SayNumbers(574));
        Assert.assertEquals( "Fizz",fb.SayNumbers(75));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(567));
        Assert.assertEquals( "Whizz",fb.SayNumbers(175));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(1575));
        Assert.assertEquals( "1357",fb.SayNumbers(1357));
        Assert.assertEquals( "Fizz",fb.SayNumbers(537));
        Assert.assertEquals( "1375",fb.SayNumbers(1375));
        Assert.assertEquals( "Whizz",fb.SayNumbers(3157));
        Assert.assertEquals( "Fizz",fb.SayNumbers(375));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(357));
        Assert.assertEquals( "Whizz",fb.SayNumbers(3745));
        Assert.assertEquals( "FizzWhizz",fb.SayNumbers(735));
    }

}
