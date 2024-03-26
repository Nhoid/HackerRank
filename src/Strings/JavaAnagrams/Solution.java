package Strings.JavaAnagrams;

import java.util.Scanner;

//Function Description

//Complete the isAnagram function in the editor.
//
//isAnagram has the following parameters:
//
//string a: the first string
//string b: the second string
//
//Returns
//
//boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
//
//Input Format
//
//The first line contains a string a. The second line contains a string b.

public class Solution {


    public static boolean isAnagram(String a, String b){
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);


        String anagrama1 = new String(A);
        String anagrama2 = new String(B);

        return anagrama1.compareToIgnoreCase(anagrama2) == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}