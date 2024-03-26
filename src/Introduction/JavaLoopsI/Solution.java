package Introduction.JavaLoopsI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task Given an integer, n, print its first 10 multiples.
// Each multiple n x i (where i ranges from 1 to 10) should be printed on a new line in the form: n x i = result.
//
//Input Format
//
//A single integer, n.


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) System.out.println(String.format("%d x %d = %d", N, i, N*i));


        bufferedReader.close();
    }
}