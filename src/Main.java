//Author: Joanna Jacob
// version 3.0
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String og_string = input.nextLine();
        og_string = og_string.toLowerCase();

        String reversed = "";

        for(int i=og_string.length()-1; i>=0; i--){
            reversed = reversed + og_string.charAt(i);
        }
        if(og_string.equals(reversed)){
            System.out.println(og_string + " is a palindrome");
        }
        else{
            System.out.println(og_string + " is not a palindrome");
        }
    }
}
