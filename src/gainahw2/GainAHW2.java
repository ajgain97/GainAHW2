package gainahw2;
import java.util.Scanner;

/**
 * My words and actions will reflect Academic Integrity. 
 * I will not cheat or lie or steal in academic matters. 
 * I will promote integrity in the UNCG community.
 * Austin Gain  02/15/2022
 */

/*
GainAHW2
Austin Gain
CSC 230, Sec. 3
*/

public class GainAHW2 {
    
    public static int countUppercase(String str) {
        if (str.length() == 0) {
            return 0;
        }
        else if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            return countUppercase(str.substring(1)) + 1;
        }
        else {
            return countUppercase(str.substring(1));
        }
    }
    
    public static int count(char[] chars) {
        return count(chars, chars.length - 1);
    }
    
    private static int count(char[] chars, int high) {
        if (high < 0) {
            return 0;
        }
        if (Character.isUpperCase(chars[high])) {
            return count(chars, high - 1) + 1;
        }
        else {
            return count(chars, high - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("GainAHW2\n" + 
                "Austin Gain\n" + 
                "CSC 230, Sec 3\n\n" +
                "This program creates a recursive method called countUppercase() to return\n" +
                "the number of uppercase letters in a string\n" +
                "A second method uses a recursive method and a helper method.\n" +
                "The method is called count() and it returns the number of uppercase letters in an array of\n" +
                "characters.\n");
        
        System.out.println("This is the run from calling countUppercase()");
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        System.out.printf("The uppercase letters in %s is %d\n\n", s1, countUppercase(s1));
        
        System.out.println("This is the run from calling count()");
        System.out.print("Enter a string: ");
        String s2 = input.nextLine();
        System.out.printf("The number of uppercase letters is %d\n", count(s2.toCharArray()));
    }
}
