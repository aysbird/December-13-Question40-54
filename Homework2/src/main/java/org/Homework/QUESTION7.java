package org.Homework;

public class QUESTION7 {
    static int i;
    int j;

    public static  void main(String[] args) {
        QUESTION7 x1 = new QUESTION7();
        QUESTION7 x2 = new QUESTION7();
        i = 3;
        x1.j = 4;
        i = 5;
        x2.j = 6;
        System.out.println(
                i + " " +
                x1.j + " " +
                i + " " +
                x2.j);
    }    //output : C.5456
}
