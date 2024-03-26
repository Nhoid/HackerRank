package Strings.JavaSubstringComparisons;

import java.util.Scanner;

//Function Description
//Complete the getSmallestAndLargest function in the editor below.
//
//getSmallestAndLargest has the following parameters:
//
//string s: a string
//int k: the length of the substrings to find
//
//        Returns
//
//string: the string '<smallest>' + "\n" + '<largest>' where <smallest> and <largest> are the two substrings
//
//Input Format
//
//The first line contains a string denoting s. The second line contains an integer denoting k.

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i = 1; i < s.length()-k+1; i++){


            String temp = s.substring(i, i+k);


            if (temp.compareTo(smallest) > 0){
                smallest = temp;
            }

            if (temp.compareTo(largest) < 0){
                largest = temp;
            }
        }

        return largest + "\n" + smallest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}