package src.main.java.org.Dec13.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Question49 {

    public static void main(String[] args) {

        int[] list = {2, 5, 3, 14, 5, 25};
        Arrays.sort(list);
        System.out.println( "Largest Number is :"+list[list.length-1]);
    }
}
/*49
Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
input : [2,5,3,14,5,25]
output: Largest number is : 25

 */