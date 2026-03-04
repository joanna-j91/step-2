//Author: Joanna Jacob
// version 13.0

import java.util.*;

public class Main {

    static boolean usingStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray())
            if (c != stack.pop()) return false;
        return true;
    }

    static boolean usingTwoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

    static long time(Runnable fn) {
        long start = System.nanoTime();
        fn.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        String s = "racecar";

        long start1 = System.nanoTime();
        usingStack(s);
        long t1 = System.nanoTime() - start1;

        long start2 = System.nanoTime();
        usingTwoPointer(s);
        long t2 = System.nanoTime() - start2;

        System.out.println("Stack       : " + t1 + " ns");
        System.out.println("Two Pointer : " + t2 + " ns");
        System.out.println("Faster      : " + (t1 < t2 ? "Stack" : "Two Pointer"));
    }
}