//Author: Joanna Jacob
// version 5.0

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean result = true;

        System.out.println("Enter the String: ");
        String real = input.nextLine();

        Queue q = new LinkedList();
        Stack st = new Stack();


        for(int i=0; i<=real.length()-1; i++) {
            q.add(real.charAt(i));
            st.push(real.charAt(i));
        }

        while(!st.isEmpty()) {
            if (q.remove() != st.pop()) {
                result = false;
            }
        }
        System.out.println(real + " is a palindrome? " + result);
    }
}
