package src.main.java.org.Dec13.Homework;

public class Question50 {
    public static void main(String[] args)
    {
        int numbers = 25;

        for (int i=1; i<=numbers; i++)
        {
            if (i%5==0)
                System.out.println("FizzBuzz");

            else if (i%2==0)
                System.out.println("Buzz");

            else if (i%3==0)
                System.out.println("Fizz");

            else
                System.out.println(numbers);
        }
    }
}

/*
50- Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
 */