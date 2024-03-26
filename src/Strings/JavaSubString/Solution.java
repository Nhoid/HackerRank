package Strings.JavaSubString;


import java.util.Scanner;

//Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end.
// You'll find the String class' substring method helpful in completing this challenge.
//
//        Input Format
//
//The first line contains a single string denoting s.
//The second line contains two space-separated integers denoting the respective values of start and end.
//Print the substring in the inclusive range from start to end.
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start , end));
    }
}
