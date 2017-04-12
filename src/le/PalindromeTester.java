package le;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * This is the main class for the Palindrome project
 * 
 * @author Phuc Hong Le
 * @version 4/12/2017
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "";
        boolean palindrome = false;
        ArrayDeque deque = new ArrayDeque();
        //prompt the user for input
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        //change the case and split the word into character
        String changeCase = input.toLowerCase();
        String[] character = changeCase.split("");
        //checking if the character meets the requirement for adding
        for (int i = 0; i < character.length; i++) {
            if (Character.isLetter(character[i].charAt(0))) {
                deque.add(character[i]);
            }
        }
        //checking if the word is palindrome or not
        while (!deque.isEmpty() && deque.size() != 1){
            palindrome = deque.getLast().equals(deque.getFirst());
            deque.remove(deque.getFirst());
            deque.remove(deque.getLast());
        }
        System.out.println("Result: " + palindrome);

    }

}
