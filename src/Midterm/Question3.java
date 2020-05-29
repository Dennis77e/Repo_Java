package Midterm;

public class Question3 {


    public static void main(String[] args) {
        int speed = 130;
        toll(speed);
    }

    public static void toll(int speed) {
        int point = 0;
        int diff = 0;
        if(speed > 70) {
            diff = speed - 70;
            point = diff/5;
            if(point >= 12) {
                System.out.println( "DriverLicense is suspended");
            }else {
                System.out.println("charged on " + point + " points");
            }

        }else {
            System.out.println("with limit");
        }
    }
}
