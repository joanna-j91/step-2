//Author: Joanna Jacob
// version 11.0

import java.util.*;

class PalindromeChecker{
    public boolean PalindromeCheck(String str) {
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args){

        PalindromeChecker p = new PalindromeChecker();
        String input = "A maN a pLan a CANal PANAma";
        System.out.println("Is Palindrome? : " + p.PalindromeCheck(input));
    }
}
