package lesson4;

public class Main {
    public static void main(String[] args) {
        int firstClientNumber = 1;
        int secondClientNumber = 2;

        int amountOfDaysOne = 5;
        int amountOfDaysTwo = 7;

        String currency = "EUR";

        double smartphonePriceSales = 12153.41;
        double laptopPriceSales = 10486.85;

        String productOne = "smartphone";
        String productTwo = "laptop";

        double salesByDaySmartphone = smartphonePriceSales / amountOfDaysOne;
        double salesByDayLaptop = laptopPriceSales / amountOfDaysTwo;

        System.out.printf(" Product No %d: %s, %n total sales for %d days is %s %f, %n sales by day is %s %f. %n",
        firstClientNumber, productOne,amountOfDaysOne, currency, smartphonePriceSales, currency, salesByDaySmartphone);
        System.out.printf(" Product No %d: %s, %n total sales for %d days is %s %f, %n sales by day is %s %f.",
                secondClientNumber, productTwo,amountOfDaysTwo, currency, laptopPriceSales, currency, salesByDayLaptop);
    }
}
