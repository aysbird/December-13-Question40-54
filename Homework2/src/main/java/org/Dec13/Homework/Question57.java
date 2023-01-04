package src.main.java.org.Dec13.Homework;

public class Question57 {
    public static void main(String[] args) {
        int num = 3798, reversed= 0;
        System.out.println("Original Number: " + num);
        while(num !=0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num/=10;

        }
        System.out.println("Reversed NUmber: " +reversed);
    }
}

/*57- Java Program to Reverse a Number
input: reverseNumber(3798); output: 8973
 *
 */