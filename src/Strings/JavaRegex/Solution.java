package Strings.JavaRegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
//Write a class called MyRegex which will contain a string pattern.
// You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.
// Use the following definition of an IP address:
//
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
//Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
//
//Some valid IP addresses:
//
//        000.12.12.034
//        121.234.12.12
//        23.45.12.56
//
//Some invalid IP addresses:
//
//        000.12.234.23.23
//        666.666.23.23
//        .213.123.23.32
//        23.45.22.32.
//I.Am.not.an.ip
//
//In this problem, you will be provided strings containing any combination of ASCII characters.
//You have to write a regular expression to find the valid IPs.
//
//Just write the MyRegex class which contains a String pattern. The string should contain the correct regular expression.
//
//        (MyRegex class MUST NOT be public)


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        while (input.hasNext()) {
            System.out.println( myRegex.setIpv4(input.nextLine()) );
        }
    }
}



class MyRegex{
    private String pattern = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";

    private String ipv4;

    private int[] valores;

    public MyRegex() {
    }

    public String getPattern() {
        return pattern;
    }

    public String getIpv4() {
        return ipv4;
    }

    public boolean setIpv4(String ipv4) {
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(ipv4);

        if (!matcher.find()) return matcher.find();

        return verifyIP(ipv4);
    }
    private boolean verifyIP( String ipv4){
        String[] numbers = ipv4.split("\\.");

        for (String number : numbers) {
            int verify = Integer.parseInt(number);

            if (verify > 255) return false;
        }
        this.ipv4 = ipv4;
        return true;
    }
}
