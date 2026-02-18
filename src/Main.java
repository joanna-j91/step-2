//Author: Joanna Jacob
// version 4.0
import java.util.Scanner;
class Palindrome{
    public static boolean checker(String s){
        char[] string = s.toCharArray();
        int low = 0, high = string.length-1;
        while(low <= high){
            if(string[low] != string[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println(Palindrome.checker("racecar"));
    }
}
