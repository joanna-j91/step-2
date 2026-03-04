//Author: Joanna Jacob
// version 12.0

import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String s);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) deque.add(c);

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    void check(String s) {
        System.out.println(s + " → " + (strategy.isPalindrome(s) ? "Palindrome" : "Not a Palindrome"));
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
        System.out.println("Stack: ");
        checker.check("racecar");
        checker.check("hello");

        checker = new PalindromeChecker(new DequeStrategy());
        System.out.println("Deque: ");
        checker.check("madam");
        checker.check("world");
    }
}