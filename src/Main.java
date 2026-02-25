//Author: Joanna Jacob
// version 9.0

import java.util.*;

public class Main {
    public static boolean javaPalindromeCheck(String s, int start, int end){
        if(start >= end) {
            return true;
        }
        if(s.charAt(start) == s.charAt(end)) {
            return javaPalindromeCheck(s, start + 1, end - 1);
        }
        return false;
    }

    public static void main(String[] args){
        String input = "madam";
        System.out.println("Is Palindrome? : " + javaPalindromeCheck(input, 0, input.length() - 1));
    }
}
