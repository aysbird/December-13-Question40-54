package src.main.java.org.Dec13.Homework;

public class Question53 {

        public Integer getNumberSmallBags(Integer big, Integer small, Integer goal) {
        int result = -1;
        if (big * 5 >= goal) {
            if (small >= goal % 5)
                result = goal % 5;
        } else {
            if (small >= goal - big * 5) {
                result = goal - big * 5;
            }
        }
        return result;
    }
    }



/*Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each)
 write a method that returns true if it is possible to make a package with goal kilos of rice.
 *
 */