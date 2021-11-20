package primitives;

public class CastingPractice {

    public static void main(String[] args) {


        // casting practice

        int number1 = 23;

        long l1 = number1;// implicit casting is happen by java.

        short sh1 = (short) number1; // explicit casting

        byte by1 = 1;
        byte by2 = 2;

        // short sum = by1 + by2 ; compile time error (due to numeric promotin java want to store the result into
        //larger data type (int) that is why it is not compile / convert.

        short sum2 = (short) (by1 + by2); //expilicit casting


        // short sum3 = (short)by1 + (short)by2; this is still individual casting for each variable
        //result is not casted yet.

        int price1 = (int) 750.99;

        System.out.println(price1);

        double samsung = 900.45;

        int priceSamsung = (int) samsung;
        System.out.println("samsung --> " +samsung);
        System.out.println("price samsung in int" + priceSamsung);

    }



}
