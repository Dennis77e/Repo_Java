package HM;

public class HomeWork {

    public static void main(String[] args0) {

        short NumberOfHoursInDay = 24;
        short NumberOfMaxDayInAYear = 365;
        short TotalNumberOfEmployees = 50;
        long PopulationInACountry = 328200000;
        float InterestRate = 2.9f;
        double BalanceInBank = 999999.9;
        boolean FromWest = true;
        String Initial = "D.G.";
        String Name = "Denis";

        System.out.println(NumberOfHoursInDay);
        System.out.println(NumberOfMaxDayInAYear);
        System.out.println(TotalNumberOfEmployees);
        System.out.println(PopulationInACountry);
        System.out.println(InterestRate);
        System.out.println(BalanceInBank);
        System.out.println(FromWest);
        System.out.println(Initial);
        System.out.println(Name);

        //

        double fTemp = 80;
        double cTemp = (5 / 9.0) * (fTemp - 32);
        System.out.println("Temp in Celsius = " + cTemp);


        //

        double cTemperatures = 50;
        double fTemperatures = cTemperatures * 9 / 5 + 32;
        System.out.println("Temp in Fahrenheit = " + fTemperatures);


        //

        double kTemp = 2;
        double cTemp1 = kTemp - 273;
        System.out.println("Temp Kelvin to Celsius = " + cTemp1);

        double cTemp2 = 2;
        double kTemp1 = cTemp2 + 273;
        System.out.println("Temp Celsius to Kelvin = " + kTemp1);


        double kTemp2 = 6;
        double fTemp3 = (kTemp2 - 273) * 9 / 5 + 32;
        System.out.println("Temp Kelvin to Fahrenheit = " + fTemp3);

        double fTemp4 = 25;
        double kTemp4 = (fTemp4 - 32) * 5 / 9 + 273;
        System.out.println("Temp Fahrenheit to Kelvin = " + kTemp4);
    }

    }
