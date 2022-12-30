package org.Homework;

public class QUESTION1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ < ++y) {
            System.out.print(" Hello ");
        } else
            System.out.print("Welcome ");
            System.out.print(" Log " + x + ":"  + y );
        }
    }
          //output :  A.Hello Log 2:2
