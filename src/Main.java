//Author: Joanna Jacob
// version 5.0

import java.util.*;

public class Main {
    public static void main(String[] args){
        String str = "racecar";
        boolean result = true;
        Deque<Character> charDeque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            charDeque.add(str.charAt(i));
        }

        while (charDeque.size() > 1) {
            Character first = charDeque.pollFirst();
            Character last = charDeque.pollLast();
            if (!first.equals(last)) {
                result = false;
                break;
            }
        }
        System.out.println(str + " is a palindrome? " + result);
    }
}
