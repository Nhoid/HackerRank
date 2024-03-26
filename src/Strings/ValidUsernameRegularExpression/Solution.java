package Strings.ValidUsernameRegularExpression;

import java.util.Scanner;
//You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
//
//The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
//The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters (a to z), uppercase characters (A to Z), and digits (0 to 9).
//The first character of the username must be an alphabetic character, i.e., either a lowercase character (a to z) or an uppercase character (A to Z).
//
//For example:
//Username	Validity
//User	INVALID; Username length < 8 characters
//User_1234	VALID
//User12345	VALID
//1User	INVALID; Username begins with non-alphabetic character
//User?1234	INVALID; '?' character not allowed
//
//Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.
//
//Input Format
//
//The first line of input contains an integer n, describing the total number of usernames. Each of the next lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
//
//Output Format
//
//For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.


class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z]{1}[a-zA-Z_0-9]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}