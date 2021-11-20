package primitives;

public class UnaryyPractice {


    public static void main(String[] args){

        int studentNumber = 25;
        System.out.println(studentNumber);

        studentNumber = studentNumber++;

        System.out.println(studentNumber);

        studentNumber = studentNumber++;
        System.out.println(studentNumber);

        studentNumber= ++studentNumber;

        System.out.println(studentNumber);

        int count = 5;
        System.out.println(count++);
        System.out.println(++count);

        int num1 = 25;
        System.out.println(num1++);// behind the scene show 25 but it 26.
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        int count1 = 5;
        System.out.println(++count); // increase to 6 and show 6.

        //=========================
        System.out.println(count1++); //shows 6 it is 7

      //  ============================
        int number = 8;
        System.out.println(number--); // shows 8 but its 7 behind the scene
        System.out.println(number--); // shows 7 but its 6

        System.out.println(--number); //show 5 it is 5.

        number++;
        System.out.println(number++ + number++); //shows 13 it is 8.


        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result);/// showing 3 but number is 7
        System.out.println(number);



        ///=======================

        int a = ++number ;
        System.out.println(a);











}
}
