package com.algor;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarySearchTest {

    @org.junit.jupiter.api.Test
     void search(){
        int[] a = {1,2,3,4,5};
        int mid = binarySearch.rank(3,a);
        assertTrue(mid == 3);
    }

}