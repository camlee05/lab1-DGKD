package com.camlee;

public class ScoreCalculator {

    public static String classify(int score) {

        String result;

        if (score < 0 || score > 100) {
            result = "INVALID";
        } else if (score >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        int bonus = 0;

        for (int i = 0; i < 3; i++) {

            if (score >= 80) {
                bonus++;
            }
        }

        return result + "-BONUS" + bonus;
    }

    public static void main(String[] args) {

        System.out.println(classify(85));

    }
}