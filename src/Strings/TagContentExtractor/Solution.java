package Strings.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
//In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
//
//Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criteria:
//
//The name of the start and end tags must be the same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
//Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
//Tags can consist of any printable characters.
//
//        Input Format
//
//The first line of input contains a single integer, n, (the number of lines). The subsequent lines each contain a line of text.
//
//        Output Format
//
//For each line, print the content enclosed within valid tags. If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.


public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<([^>]+)>[^<>]*</\\1>";
        Pattern pattern = Pattern.compile(regex);


        while(testCases>0){
            String line = in.nextLine();

            Matcher matcher = pattern.matcher(line);


            Boolean verify = true;

            while (matcher.find()) {

                String match = matcher.group();

                match = match.replaceAll("<[^>]+>", "");

                if (!match.isEmpty()) {
                    System.out.println(match);
                    verify = false;

                }

            }


            if (!matcher.find() && verify) System.out.println("None");


            testCases--;

        }
    }
}



