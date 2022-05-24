package org.opentutorials.javatutorials.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Codestates {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr2 = new int[]{-1, -2, 1, 2, 3, 4, 5};
        System.out.println(sl.take(5, arr2));
    }
}

class Solution {
    int[] take(int num, int[] arr){
        // TODO:
        if(arr.length == 0 || arr.length <= num) return arr;
        if(num == 0) return new int[0];

        int[] head = Arrays.copyOfRange(arr, 0, 1);
        int[] tail = take(num-1, Arrays.copyOfRange(arr, 1, arr.length));

        int[] result = new int[arr.length - (head.length + tail.length)];
        result = Arrays.copyOfRange(arr, 0, num);
        return result;
    }
}
