package Introduction.JavaStdinandStdout;

import java.util.Scanner;


//Question:
//In this challenge, you must read integers from stdin and then print them to stdout.
// Each integer must be printed on a new line.


//Input Format:
//There are lines of input, and each line contains a single integer.

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for(int i = 0; i < 3; i++){
            int a = scan.nextInt();
            System.out.println(a);
        }

        scan.close();
    }
}
