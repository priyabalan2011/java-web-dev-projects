package org.launchcode;
import java.util.Scanner;
public class SearchStrings {
    public static void  main(String args[])
    {
        String  str ="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use " +
                "of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search term: ");
        String searchStr = input.nextLine();
        if(str.toLowerCase().contains(searchStr))
        {
            System.out.println("Your searched term " + searchStr + " is found " );
            Integer index = str.indexOf(searchStr);
            Integer length = searchStr.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = str.replace(searchStr, "");
            System.out.println(modifiedSentence);
        }
        else
        {
            System.out.println("Your searched term " + searchStr + " is not found " );
        }


    }
}
