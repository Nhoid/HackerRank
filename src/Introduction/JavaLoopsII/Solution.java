package Introduction.JavaLoopsII;

import java.util.Scanner;

//Input Format
//
//The first line contains an integer, q, denoting the number of queries.
//Each of the subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.
//
//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of space-separated integers.

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int operation = a;

            for (int j =0; j < n; j++){
                int twopow = (int) Math.pow(2, j);
                operation += twopow * b;
                System.out.print(operation + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
