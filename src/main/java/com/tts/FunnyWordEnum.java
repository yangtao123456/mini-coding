package com.tts;

public enum FunnyWordEnum {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz");

    private final String funnyWord;

    FunnyWordEnum(String funnyWord) {
        this.funnyWord = funnyWord;
    }

    public String toString() {
        return funnyWord;
    }
}

