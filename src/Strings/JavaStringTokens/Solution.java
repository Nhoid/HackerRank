package Strings.JavaStringTokens;

import java.util.*;
//
//Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
//
//Note: You may find the String.split method helpful in completing this challenge.
//
//Input Format
//
//A single string, s.
//
// Constraints
//
//s is composed of any of the following:
// English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('),
//and at symbols (@).
//
//Output Format
//
//On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
// Next, print each of the tokens on a new line in the same order as they appear in input string s.

public class Solution {

    public static void main(String[] args) {
        String regex = "[\s !,?._'@]+";

        Scanner input = new Scanner(System.in);

        String entrada = input.nextLine();

        input.close();

        String[] stringSplited = entrada.split(regex);

        System.out.println(Arrays.stream(stringSplited).filter(string -> !Objects.equals(string, ""))
                .toArray().length);
        Arrays.stream(stringSplited).filter(string -> !Objects.equals(string, "") && string != " ")
                .forEach(System.out::println);


    }
}