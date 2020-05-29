package Midterm;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int[] arr1 = {1, 2, 4, 3, 1, 6, 1};
        System.out.println(Arrays.toString(removeNum(arr, 24)));
        System.out.println(Arrays.toString(removeNum(arr1, 11)));
    }

    public static int[] removeNum(int[] arr, int num) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        if(count == 0) {
            return arr;
        }else {
            int idx = 0;
            int[] result = new int[arr.length - count];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != num) {
                    result[idx] = arr[i];
                    idx++;
                }
            }
            return result;
        }
    }
}






