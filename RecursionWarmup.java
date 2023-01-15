// Title:              RecursionWarmup.java
// Files:              RecursionWarmup.java
// Quarter:            (CSE 8B) Spring 2020
//
// Author:             Yutao Ye
// Email:              y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//
import java.util.ArrayList;

/**
 * convert to binary, and find if the sum of subset
 * matches
 *
 * Bugs: none
 *
 * @author Yutao Ye
 */
public class RecursionWarmup {
    
    /**
    * convert base 10 to base 2.
    *
    * @param (n) (number bases 10)
    * @return (string type binary number)
    */
    public static String binaryString(int n) {
        //base case
        if (n <= 1) {
            return Integer.toString(n);
        }
        //recursive case
        else {
            return binaryString(n / 2) + (n % 2);
        }
    }

    /**
    * find if the sum can be added with some subset
    *
    * @param (set) (set with int)
    * @param (targetNumber) (the sum number wants to be reached)
    * @return true if can, otherwise, false.
    */
    public static boolean isSubSetSum(ArrayList<Integer> set,
     int targetNumber) {
        ArrayList<Integer> temp = new ArrayList<>(set);
        if (targetNumber == 0) {
            return true;
        }
        else if (temp.size() == 0) {
            return false;
        }
        else {
            int number = temp.get(0);
            temp.remove(0);
            
            //use or not use the first number
            return isSubSetSum(temp, targetNumber - number) ||
            isSubSetSum(temp, targetNumber);

        }
        
    }

    /**
    * test the binary and ifsubsetsum
    *
    * @param (args) (Strings that are passed to the "main" function.)
    * @return (none)
    */
    public static void main (String[] args) {
        System.out.println(binaryString(22));
        System.out.println(binaryString(14));
        ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(3);
        set1.add(7);
        set1.add(1);
        set1.add(8);
        set1.add(-3);
        System.out.println(isSubSetSum(set1, 100));
    }
}
