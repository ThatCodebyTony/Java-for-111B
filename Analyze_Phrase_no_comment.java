/* 
Tony Wu
CS 111B Assignment 4
Count Words and display longest word
This is a test for Java
how do we make comments?
we use // for single line comments
then we use /* for multi-line comments
co-pilot is cool
next test is to see if we can commit this
here is another one.
and this one

*/

// Hello testthing this commit
// final comment

import java.util.Scanner;
import java.util.Arrays;

public class Analyze_Phrase_no_comment
{

  public static void main(String[] args)
  {
    String phrase;
    int numWords;

    phrase = inputPhrase();

    numWords = analyzePhrase(phrase);

    System.out.println("Your phrase has " + numWords + " words in it.");
    System.out.println();
  }


  public static String inputPhrase() {
    String inputPhrase_phrase;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a phrase all on one line, \nwith just one space separating each word, \nand no spaces at the beginning or end of the phrase.\n");
    inputPhrase_phrase = scan.nextLine();
    String phrase_no_space = inputPhrase_phrase.replaceAll("\\s+","");
    while (phrase_no_space.length() < 5) {
      System.out.println();
      System.out.println("Your phrase " + '"' + inputPhrase_phrase + '"' + " is less than 5 characters.");
      System.out.println("Please enter a phrase all on one line, \nwith just one space separating each word, \nand no spaces at the beginning or end of the phrase.\n");
      inputPhrase_phrase = scan.nextLine();
      phrase_no_space = inputPhrase_phrase.replaceAll("\\s+","");
    }
    return(inputPhrase_phrase);
  }

  public static int analyzePhrase (String analyzePhrase_numWords) {
    String long_name = null;
    int  length = 0, longest_word_count;

    String after = analyzePhrase_numWords.replaceAll("\\s+", " ");
    String split_words_array[] = after.split(" ");
    for (String name: split_words_array) {
        if (length < name.length()) {
            length = name.length();
            long_name = name;
        }
    }
    longest_word_count  = long_name.length();
    System.out.println();
    System.out.println("The longest word in your phrase is " + '"' + long_name + '"' + " with " + longest_word_count + " characters.");

    return(split_words_array.length);
  }

}
