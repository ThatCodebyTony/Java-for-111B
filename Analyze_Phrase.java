/* 
Tony Wu
CS 111B Assignment 4
Count Words and display longest word
*/

import java.util.Scanner;
import java.util.Arrays;

public class Analyze_Phrase
{
  //main Method
  public static void main(String[] args)
  {
    String phrase;
    int numWords;

    phrase = inputPhrase();

    numWords = analyzePhrase(phrase);

    System.out.println("Your phrase has " + numWords + " words in it.");
    System.out.println();
  }
  //End of main Method.
  

  //inputPhrase Method.
  //ensures the user inputs atleast 5 characters.
  //it will delete all the white spaces to ensure only characters are counted.
  public static String inputPhrase()
  {
    String inputPhrase_phrase;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a phrase all on one line, \nwith just one space separating each word, \nand no spaces at the beginning or end of the phrase.\n");
    inputPhrase_phrase = scan.nextLine();

    //EXPLANATION: "phrase.replaceAll("\\s+","");" deletes all white spaces between characters.
    //This ensures that number white spaces are not included in the total number of characters.
    String phrase_no_space = inputPhrase_phrase.replaceAll("\\s+","");

    //EXPLANATION: This while loop ensures the user input will be greater than 5 characters.
    //be sure to put "phrase = scan.nextLine();" into while loop for loop to work.
    while (phrase_no_space.length() < 5)
    {
      System.out.println();
      System.out.println("Your phrase " + '"' + inputPhrase_phrase + '"' + " is less than 5 characters.");
      System.out.println("Please enter a phrase all on one line, \nwith just one space separating each word, \nand no spaces at the beginning or end of the phrase.\n");
      inputPhrase_phrase = scan.nextLine();
      phrase_no_space = inputPhrase_phrase.replaceAll("\\s+","");
    }
    return(inputPhrase_phrase);
  }
  //End of inputPhrase Method.


  //analyzePhrase Method.
  //Ensures there is atleast 1 white space between each word.
  //Which allows .split(" ") to seperate the strings.
  //The split() method in Java is invoked by a string and returns an array of strings
  //Which then allows us to input the strings into an array[].
  public static int analyzePhrase (String analyzePhrase_numWords)
  {

    String long_name = null;
    int  length = 0, longest_word_count;

    //EXPLANATION: "replaceAll("\\s+", " ");" takes out all white spaces expect for 1.
    //This obeject ensures the number of white spaces between each word is > 1.
    //We need this to allow "split(" ");" to work.
    String after = analyzePhrase_numWords.replaceAll("\\s+", " ");
    
    //EXPLANATION: "split(" ");" will split the string by a single white space.
    //the "replaceAll("\\s+", " ");" ensures we only have one white space between each word, no matter how many white spaces the user inputs.
    //This means, due to "split(" ");", each word can become unique elements in an array.
    String split_words_array[] = after.split(" ");

    //EXPLANATION: "for (String name: split_words": a for loop that goes through all the elements of an array.
    //This loop finds the word, in the array, with the most characters.
    for (String name: split_words_array) 
    {
        if (length < name.length())
        {
            length = name.length();
            long_name = name;
        }
    }

    longest_word_count  = long_name.length();
    System.out.println();
    System.out.println("The longest word in your phrase is " + '"' + long_name + '"' + " with " + longest_word_count + " characters.");

    return(split_words_array.length);
  }
  //End of analyzePhrase Method.
}


/*
------------------
Sample Output # 1:
-------------------
Please enter a phrase all on one line, 
with just one space separating each word,
and no spaces at the beginning or end of the phrase.

about tony wu lol no oh no great doooog

The longest word in your phrase is "doooog" with 6 characters.
Your phrase has 6 words in it.

------------------
Sample Output # 2:
-------------------

Please enter a phrase all on one line, 
with just one space separating each word,
and no spaces at the beginning or end of the phrase.

no

Your phrase "no" is less than 5 characters.
Please enter a phrase all on one line,
with just one space separating each word,
and no spaces at the beginning or end of the phrase.

what the heck how about now then

The longest word in your phrase is "about" with 5 characters.
Your phrase has 5 words in it.

 */