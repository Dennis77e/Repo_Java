package HM;

public class HomeWork3 {

    public static void main(String[] args) {

        String sentence ="once uPon a Time in the UNIVERSE";
        sentence = sentence.toLowerCase();
        String result = "";
        String[] arr = sentence.split( " ");

        for (int i = 0; i < arr.length; i++) {
            result += arr[i].substring(0,1). toUpperCase() + arr[i].substring(1) + " ";
        }
        result = result.trim();
        System.out.println(result);
    }
}

