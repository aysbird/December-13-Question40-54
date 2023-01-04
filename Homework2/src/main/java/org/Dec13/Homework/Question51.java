package src.main.java.org.Dec13.Homework;

public class Question51 {
    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}


/* A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a method that checks if a number is a prime number.

 *
 */