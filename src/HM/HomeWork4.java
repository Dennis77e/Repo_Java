package HM;


import java.util.Arrays;

public class HomeWork4 {

    public static void main(String[] args) {

        String[] arr = {"john", "michael","dora","philip","ilena","palena","fahry"};
        String nameToSearch = "palena";
        int[] numbers = {45,22,11,65,189,91,100,81};
        int[] scores = {90,89,191,100,81};
        String[] names = {"Happy","Peace","Jesse","Kaitlin","Lucky"};


        index(arr,nameToSearch);
        average(numbers);
        maximum(numbers);
        highest(scores,names);
    }

    public static void index (String[] arr, String nameToSearch) {
        int count = 0;
        for(int i =0; i < arr.length; i++) {
            if(arr[i].equals(nameToSearch)) {
                count++;
                System.out.println(nameToSearch + " is on position - " + (i+1));
            }
        }
        if(count==0) {
            System.out.println(nameToSearch + " is not present in the array");
        }
    }

    public static void average (int[] nums) {
        int count = 0;
        int sum = 0;
        for(int num : nums) {
            count++;
            sum+=num;
        }
        System.out.println("Average of the array is - " + sum/count);
    }

    public static void maximum (int[] nums) {
        int max = nums[0];

        for(int i =0 ; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum is - " + max);
    }

    public static void highest (int[] scores, String[] names) {
        int max = scores[0];
        int index = 0;

        for(int i =0 ; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
                index = i;
            }
        }
        System.out.println(names[index] + " scored the maximum score("+max+")");




    }



}
