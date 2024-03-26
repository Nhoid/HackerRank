package BigNumber.JavaBigDecimal;
import java.math.BigDecimal;
import java.util.*;

//Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
//
//Given an array, s, of real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that 0.1 is printed as 0.1, and .1 is printed as .1. If two numbers represent numerically equivalent values (e.g., .1 and 0.1), then they must be listed in the same order as they were received as input.
//
//Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the instructions above.
//
//Input Format
//
//The first line consists of a single integer, n, denoting the number of integer strings. Each line of the subsequent lines contains a real number denoting the value of s[i].
//
//Constraints
//
//Each s[i] has at most 300 digits.
//
//        Output Format
//
//Locked stub code in the editor will print the contents of array s to stdout. You are only responsible for reordering the array's elements.

class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 != null && o2 != null) {
                    BigDecimal bd1 = new BigDecimal(o1);
                    BigDecimal bd2 = new BigDecimal(o2);
                    return bd2.compareTo(bd1) == 0 ? 1 :bd2.compareTo(bd1) ;
                }
                return 0;
            }
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}