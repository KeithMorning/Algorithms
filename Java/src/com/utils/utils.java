package com.utils;


public class utils {
    static <T extends Comparable> T max(T[] a){
        if(a == null){
            return null;
        }
        T max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i].compareTo(max) == 1){
                max = a[i];
            }
        }

        return max;
    }

    static void revert(int[] a){
        if(a == null){
            return;
        }
        int n = a.length;
        for(int i = 0; i < n /2; i++){
            int temp = a[i];
            a[i] = a[n - 1 -i];
            a[n - 1 - i]= temp;
        }
    }
}
