package primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        boolean isHungry = true;
        System.out.println(isHungry);

        int number = 11;
        System.out.println(number);

        boolean isLighton = false;
        System.out.println(isLighton);

        System.out.println(true);

        System.out.println(isHungry == isLighton);

        isLighton =isHungry;
        isLighton= false;
        System.out.println("last version for isHungry>> " +isHungry); //true

        System.out.println("last for is light " +isLighton);//false









    }
}
