package com.utils;

import static org.junit.jupiter.api.Assertions.*;

class utilsTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void max() {
        Integer a[] = {1,2,3,4};
        Integer max = utils.max(a);
        assertTrue(max.equals(4));

        Integer b[] = {3,1,2,0};
        max = utils.max(b);
        assertTrue(max.equals(3));
    }
}