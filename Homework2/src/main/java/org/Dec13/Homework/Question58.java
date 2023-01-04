package src.main.java.org.Dec13.Homework;

public class Question58 {
    public static void main(String[] args) {

        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer  " + result);  //output : 81
    }
}





/*58- Java Program to Calculate the Power of a Number
 input: powerOfANumber(3,4); output: 81
 input: powerOfANumber(2,5); output: 32
 *
 */