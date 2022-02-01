package com.test;

public class Grader {

    public String grade(int result) {

        if (result < 0 || result > 100) {
            throw new IllegalArgumentException("Result should be a positive value");
        }

        if (result > 64 && result <= 74) {
            return "B";
        } else if (result >= 55 && result <= 64) {
            return "C";
        } else if (result >= 0 && result <= 54) {
            return "F";
        }

        return "A";
    }
}
