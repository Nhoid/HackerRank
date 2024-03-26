package Strings.JavaStringIntroduction;


import java.util.Scanner;

//This exercise is to test your understanding of Java Strings. A sample String declaration:

//java
//
//String myString = "Hello World!";
//
//The elements of a String are called characters.
// The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//Given two strings of lowercase English letters, a and b, perform the following operations:
//
//Sum the lengths of a and b.
//        Determine if a is lexicographically larger than b (i.e.: does a come before b in the dictionary?).
//Capitalize the first letter in a and b and print them on a single line, separated by a space.
//
//Input Format
//
//The first line contains a string a. The second line contains another string b. The strings are comprised of only lowercase English letters.
//
//        Output Format
//
//There are three lines of output:
//
//For the first line, sum the lengths of a and b.
//For the second line, write "Yes" if a is lexicographically greater than b; otherwise print "No" instead.
//For the third line, capitalize the first letter in both a and b and print them on a single line, separated by a space.


public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) >= 1) System.out.println("Yes");
        else System.out.println("No");
        System.out.println( A.substring(0,1).toUpperCase() + A.substring(1) + " "
                + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
