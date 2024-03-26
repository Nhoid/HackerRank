package Introduction.JavaStaticInitializerBlock;


import java.util.Scanner;

//Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
//
//It's time to test your knowledge of Static initialization blocks.
// You are given a class Solution with a main method.
// Complete the given code so that it outputs the area of a parallelogram with breadth b and height h.
// You should read the variables from the standard input.
//
//If b <= 0 or h <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//Input Format
//
//There are two lines of input. The first line contains b: the breadth of the parallelogram.
// The next line contains h: the height of the parallelogram.
//
//        Constraints
//
//    1 <= b, h <= 100
//
//Output Format
//
//If both values are greater than zero, then the main method must output the area of the parallelogram.
// Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte B = input.nextByte();
        byte H = input.nextByte();
        if (B > 0 && H>0) System.out.println(B*H);
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}