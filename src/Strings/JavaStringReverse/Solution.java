package Strings.JavaStringReverse;

import java.util.Scanner;

//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
//
//Given a string s, print "Yes" if it is a palindrome, print "No" otherwise.


public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer stringBuffer = new StringBuffer(A);
        if(stringBuffer.reverse().toString().compareTo(A) == 0) System.out.println("Yes");
        else System.out.println("No");

    }
}
