package HM;

public class HomeWork3reverse {

    public static void main(String[] args) {

        String message = "happy holidays";
        String reverseMessage = "";
        for (int i = message.length()-1; i>=0; i--){
            System.out.print(message.charAt(i));
        }
    }
}
