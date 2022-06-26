package com.algor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluteTest {

    @Test
    void cal() {
        String input = "(1+((2+3)*(4*5)))";
        Double value = Evalute.cal(input);
        assertTrue(value.equals(101.0));
    }
}