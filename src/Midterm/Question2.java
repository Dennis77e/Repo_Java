package Midterm;

public class Question2 {
    public static void main (String[] args) {
        int[] arr1 = {1, 3, 5, 4, 2, 7};
        int[] arr2 = {-1, -3, 4, 2};
        int[] arr3 = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        System.out.println(findMinMissingPositiveInt(arr1));
        System.out.println(findMinMissingPositiveInt(arr2));
        System.out.println(findMinMissingPositiveInt(arr3));
    }

    public static int findMinMissingPositiveInt(int []arr) {

        int num;
        int nextNum;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0 || arr[i] > arr.length) {
                continue;
            }
            num = arr[i];

            while (arr[num - 1] != num) {
                nextNum = arr[num - 1];
                arr[num - 1] = num;
                num = nextNum;
                if (num <= 0 || num > arr.length)
                    break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}

