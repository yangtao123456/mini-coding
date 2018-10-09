package com.tts;

import org.junit.Assert;
import org.junit.Test;

public class FunnyGameTest {
    /**
     * Do simple test, input given number and compare whether the result is correct.
     */
    @Test
    public void testSimpleOutByNumber(){
        int number = 33;
        String word = FunnyGameUtil.simpleOut(number);

        System.out.printf("Number %d convert to %s.\n", number, word);
        Assert.assertTrue("The output for number " + number + " should be Fizz!!!!",
                word.equals(FunnyWordEnum.FIZZ.toString()));
    }

    /**
     * Print the numbers from 1 to 100 that after simple convert.
     */
    @Test
    public void testSimpleOut() {
        System.out.println("\n<<=======================simpleOut test Start===================>>");
        for(int i=1; i<=100; i++){
            String word = FunnyGameUtil.simpleOut(i);

            System.out.printf("%d should say %s.\n", i, word);
        }
    }

    /**
     * Do simple test, input given number and compare whether the result is correct.
     * The given number is 53, the result should be FizzBuzz.
     */
    @Test
    public void testComplexOutByNumber(){
        int number = 53;
        String word = FunnyGameUtil.complexOut(number);

        System.out.printf("Number %d convert to %s.\n", number, word);
        Assert.assertTrue("The output for number " + number + " should be FizzBuzz!!!!",
                word.equals(FunnyWordEnum.FIZZ_BUZZ.toString()));
    }

    /**
     * Print the numbers from 1 to 100 that after complex convert.
     */
    @Test
    public void testComplexOut() {
        System.out.println("\n<<=======================ComplexOut test Start===================>>");
        for(int i=1; i<=100; i++){
            String word = FunnyGameUtil.complexOut(i);

            System.out.printf("%d should say %s.\n", i, word);
        }
    }
}
