//Author: Joanna Jacob
// version 10.0

import java.util.*;

public class Main {
    public static boolean javaPalindromeCheck(String str) {
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

    public static void main(String[] args){
        String input = "A maN a pLan a CANal PANAma";
        System.out.println("Is Palindrome? : " + javaPalindromeCheck(input));
    }
}
