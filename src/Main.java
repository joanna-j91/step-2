//Author: Joanna Jacob
// version 5.0

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        String input = "noon";
        boolean result = true;

        Stack <Character> charStack = new Stack<>();
        char[] charArray = input.toCharArray();

        int i =0;

        for(char c:charArray){
            charStack.push(c);
        }
        while(i < charArray.length){
            if(charStack.pop() != charArray[i]) {
                result = false;
            }
            i++;
        }
        System.out.println(input + " is a palindrome? " + result);
    }
}
