package com.tts;

public class FunnyGameUtil {
    /**
     * Returns funny words by input number, the rule as below:
     *
     * 1. For multiples of three, return FIZZ;
     * 2. For multiples of five, return BUZZ;
     * 3. For multiples of both three and five, return FizzBuzz.
     * 4. Else return input number.
     *
     * @param   number   the number that user say
     * @return  the funny word.
     */
    public static String simpleOutput(int number){
        int modByThree = Math.floorMod(number, 3), modByFive = Math.floorMod(number, 5);

        if( modByThree == 0 && modByFive == 0 ) {
            return FunnyWordEnum.FIZZ_BUZZ.toString();
        }
        if( modByThree == 0 ) {
            return FunnyWordEnum.FIZZ.toString();
        }

        if( modByFive == 0 ) {
            return FunnyWordEnum.BUZZ.toString();
        }

        return String.valueOf(number);
    }

    /**
     * Returns funny words by input number, the rule as below:
     *
     * 1. For multiples of three or has a 3 in it(Example 3, 23), return FIZZ;
     * 2. For multiples of five or has a 5 in it(Example: 5, 52), return BUZZ;
     * 3. If it satisfy 1 & 2 criterias together(Example: 45, 53), return FizzBuzz;
     * 4. Else return input number.
     *
     * @param   number   the number that user say
     * @return  the funny word.
     */
    public static String complexOutput(int number){
        int modByThree = Math.floorMod(number, 3), modByFive = Math.floorMod(number, 5);
        boolean containsThree = String.valueOf(number).indexOf("3") > -1,
                containsFive = String.valueOf(number).indexOf("5") > -1;

        if( ( modByThree == 0 || containsThree ) && ( modByFive == 0 || containsFive ) ){
            return FunnyWordEnum.FIZZ_BUZZ.toString();
        }

        if( modByThree == 0 || containsThree ){
            return FunnyWordEnum.FIZZ.toString();
        }

        if( modByFive == 0 || containsFive ){
            return FunnyWordEnum.BUZZ.toString();
        }

        return String.valueOf(number);
    }
}
