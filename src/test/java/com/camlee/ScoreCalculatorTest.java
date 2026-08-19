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

    @Test
    void testUpperBoundaryInvalidScore() {

        assertEquals(
                "INVALID-BONUS3",
                ScoreCalculator.classify(101)
        );
    }

    @Test
    void testPassWithoutBonusAtBoundary() {

        assertEquals(
                "PASS-BONUS0",
                ScoreCalculator.classify(79)
        );
    }

    @Test
    void testMinimumValidScore() {

        assertEquals(
                "FAIL-BONUS0",
                ScoreCalculator.classify(0)
        );
    }

    @Test
    void testMaximumValidScore() {

        assertEquals(
                "PASS-BONUS3",
                ScoreCalculator.classify(100)
        );
    }
}