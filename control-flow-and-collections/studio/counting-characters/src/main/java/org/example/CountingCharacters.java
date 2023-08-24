package org.example;
import java.io.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharacters {
    public static void main(String[] args) {
       /* String myString="If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there." ;*/
//BONUS  MISSION
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter your string (or ENTER to finish):");
        String myString = input.nextLine();*/

  //SUPER BONUS MISSION
        String myString = " ";
        try {
            FileInputStream file = new FileInputStream("src/main/java/org/example/sample.txt");
            DataInputStream dis = new DataInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));
            String Contents = "";

            while ((Contents = br.readLine()) != null) {
                myString+=Contents;
            }
        }catch(IOException e1){
            System.out.println(e1);
        }
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> countChars = new HashMap<>();

        for (char c : charactersInString) {
           // System.out.println(c);

                if (countChars.containsKey(c)) {
                    //if character already traversed, increment it
                    countChars.put(c, countChars.get(c) + 1);
                } else {
                    //if character not traversed, add it to hashmap
                    countChars.put(c, 1);
                }


        }
        //traverse the map and print the number of occurences of a character
        for(Map.Entry<Character,Integer> entry : countChars.entrySet()){
            System.out.println( entry.getKey() + " : " + entry.getValue());
        }

    }
}
