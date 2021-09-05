/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise04;

//Sets up Scanner
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanWords = new Scanner(System.in);

        //Sets up strings we will be using
        String noun;
        String verb;
        String adjective;
        String adverb;

        //Prompts user for noun input
        System.out.println("Enter a noun");
        //Scans user input for noun
        noun = ScanWords.nextLine();
        //Prompts user for verb input
        System.out.println("Enter a verb");
        //Scans user input for verb
        verb = ScanWords.nextLine();
        //Scans user input for adjective
        System.out.println("Enter an adjective");
        //Scans user input for adjective
        adjective = ScanWords.nextLine();
        //Prompts user for adverb input
        System.out.println("Enter an adverb");
        //Scans user input for adverb
        adverb = ScanWords.nextLine();
        //Prints out final output
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? Thats hilarious! ");
    }
}
