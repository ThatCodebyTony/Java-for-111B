/* Mayors Names

  Tony Wu
  CS110B 
  Coding Explanation: Mayors Names project

*/

import java.io.*;
import java.util.*;

class Main 
{
  public static void main(String[] args)
  {
    Scanner inFile = null, keyboard;
    String first, middle, last;
    ArrayList<FullName> mayorList = new ArrayList<FullName>();
    keyboard = new Scanner(System.in);

    System.out.println("We have a new mayor:");
    System.out.println("Please enter first name");
    first = keyboard.nextLine();
    System.out.println("Please enter middle name");
    middle = keyboard.nextLine();
    System.out.println("Please enter last name");
    last = keyboard.nextLine();

    
    // DO NOT CHANGE ANY OF THE ABOVE CODE.
    //------------------------------------------

    // If the user fails to capitalize their input, the arraylist will NOT alphabetize correctly.
    // These will capitalizes the first, middle and last name. 
    // This works too: first = first.substring(0, 1).toUpperCase() + first.substring(1);
    first = Character.toUpperCase(first.charAt(0)) + first.substring(1);
    middle = Character.toUpperCase(middle.charAt(0)) + middle.substring(1);
    last = Character.toUpperCase(last.charAt(0)) + last.substring(1); 


    // This will instantiate a FullName object from the user's input of the new mayor's name, and add it to mayorList array.
    FullName newMayor = new FullName(first, middle, last);
    mayorList.add(newMayor);

    try 
    {
      inFile = new Scanner(new File("C:\\Users\\Tony\\Desktop\\sample\\Final\\FINAL FOR SURE\\mayors.txt"));

      while (inFile.hasNextLine()) 
      {
        String line = inFile.nextLine();
        String[] names = line.split(" ");
        FullName fullName = new FullName(names[0], names[1], names[2]);
        mayorList.add(fullName);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error reading or writing file: " + e.getMessage());
    } finally {
      if (inFile != null) 
      {
        inFile.close();
      }
    } //end of try.


    //------------------------------------------
    // DO NOT CHANGE ANY OF THE BELOW CODE.
   

    Collections.sort(mayorList);
    System.out.println("Here is the list of mayors, sorted by last name:");
    for(FullName mayorName : mayorList)
      System.out.println(mayorName);
  }
}

/*

----------------------------------------
Sample Output #2:
----------------------------------------
We have a new mayor:
Please enter first name
mark
Please enter middle name
e
Please enter last name
farrell
Here is the list of mayors, sorted by last name:
Arthur Christ Agnos
London Nicole Breed
Willie Lewis Brown
Mark E Farrell
Dianne Goldman Feinstein
Francis Michael Jordan
Edwin Mah Lee
George Richard Moscone
Gavin Christopher Newsom


----------------------------------------
Sample Output #2:
----------------------------------------
We have a new mayor:
Please enter first name
f
Please enter middle name
f
Please enter last name
f
Error reading or writing file: mayors.txt (No such file or directory)
Here is the list of mayors, sorted by last name:
F F F

 */