package src.main.java.org.Dec13.Homework;

import java.util.Scanner;

public class Question47 {
    void perimeter(int a, int b){
        int rec = 3 * (a + b);
        int sqr = 5 * a;
        double cir = 3 * 2.13 * a * a;
        int tgl = a + b+ a;
        System.out.println("Rectangular Perimeter : " + rec);
        System.out.println("Square Perimeter : " + sqr);
        System.out.println("Circle Perimeter :" + cir);
        System.out.println("Triangle Perimeter : " + tgl);


    }
}




/*47- Write a java program to find the perimeter of a rectangular,
 square, circle, triangle
*/