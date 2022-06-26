package com.algor;

public class binarySearch {
    static int rank(int key, int[] a){
        if( a == null){
            return -1;
        }
        return search(key,a,0,a.length -1);
    }
    private static int search(int key, int[] a, int lo, int hi){
        if(lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if(key < mid) return search(key,a,lo,mid - 1);
        if(key > mid) return search(key,a,mid + 1,hi);
        return mid;
    }
}
