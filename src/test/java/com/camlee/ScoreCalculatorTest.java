package com.camlee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreCalculatorTest {

    @Test
    void testInvalidScore() {

        assertEquals(
                "INVALID-BONUS0",
                ScoreCalculator.classify(-1)
        );
    }

    @Test
    void testPassScore() {

        assertEquals(
                "PASS-BONUS0",
                ScoreCalculator.classify(50)
        );
    }

    @Test
    void testFailScore() {

        assertEquals(
                "FAIL-BONUS0",
                ScoreCalculator.classify(40)
        );
    }

    @Test
    void testBonus() {

        assertEquals(
                "PASS-BONUS3",
                ScoreCalculator.classify(80)
        );
    }
}