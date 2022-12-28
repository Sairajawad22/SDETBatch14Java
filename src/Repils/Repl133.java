package Repils;
/*
Create a static method with the following specs:

Returns:

an integer

Name:

countA

Parameters:

a String called s

Purpose:

count the number of occurrences of 'a' or 'A' within s

Examples:

countA("aaa") ==> 3

countA("aaBBdf8k3AAadnklA") ==> 6

Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)
 */

public class Repl133 {
    static int countA(String s) {
        s=s.replaceAll("[^Aa]", "");
        return s.length();
    }
    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
