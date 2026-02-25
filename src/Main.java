//Author: Joanna Jacob
// version 8.0

import java.util.*;

public class Main {
    public static boolean palindrome(String s){
        LinkedList<Character> node = new LinkedList<>();

        for(char c: s.toCharArray()){
            node.add(c);
        }

        while(node.size() > 1){
            if(node.removeFirst() != node.removeLast()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String input = "level";
        System.out.println("Is palindrome? : " + palindrome(input));
    }
}
