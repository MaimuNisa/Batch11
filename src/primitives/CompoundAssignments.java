package primitives;

public class CompoundAssignments {


    public static void main(String[] args) {

     // += -= *= /= %=


     int num1 = 7;
     int num2 = num1 + 7; //14 value of num2

     num1 += num2;
        System.out.println(num1); // value num1 is 21

        num2 -=8; // num2 = num2 is 8;

        System.out.println(num2);


        int num3 = num1 + num2;
        num2 += num3;

        num1 +=num3;
        System.out.println(num3);

        // *=

        num1 = 4;
        num1 *= 5;

        System.out.println(num1);// num 1 = 20

        num1 /=4;
        System.out.println(num1); // num1 =5


        num1 %= 2; //num1 = num1 % 2 ---> 5% 2 --> remainder 1
        System.out.println(num1);

     boolean bl1 = true; // cannot do in boolean

        char ch1= 'a';
        char ch2 = 'm';//// you can assign with single quotation
        char ch3 = 't';


        ch3 += 'a';
        System.out.println("this is value of ch3 : "+ ch3);

        ch2 *='3';

        System.out.println(ch2);

        ch1 -=9;
        System.out.println(ch1);


        int remAINDER = ch1%3;
        System.out.println(remAINDER);

        ch1 %=2;
        System.out.println(ch1);



    }
}
