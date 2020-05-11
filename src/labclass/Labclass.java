package labclass;

public class Labclass {

    public static void main(String[] args) {

        String[] name= {"happy","peace", "laugh", "love", "grow", "learn"};
        for ( int i=1; i< name.length;i++){
            System.out.println("name:" + name[i]);


        }

        String[] months = {"January", "February", "March", "April" , "May", "June", "July", "August", "September", "October", "November", "December"};

        for (String month: months) {
            String season ="";
            switch (month.toLowerCase()){
                case "january":
                case "february":
                case "december":
                    season = "Winter";
                    break;



            }
        }


    }
}
