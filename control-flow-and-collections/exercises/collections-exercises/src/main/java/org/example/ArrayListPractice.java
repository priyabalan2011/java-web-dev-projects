package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collection;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(10);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        int sum=sumEven(arrayList);
        System.out.println(sum);

        String phrase = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> sampleString = new ArrayList<String>();
        sampleString.add("priya");
        sampleString.add("balan");
        sampleString.add("harish");
        sampleString.add("kavin");
        sampleString.add("dhivikshan");


        //System.out.println(findstring(sampleString));
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
   String[] result= findstring(sampleString, numChars);


    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static String[] findstring(ArrayList<String> stringsArr, int numchars)
    {
        String[] newStrArray = new String[stringsArr.size()];
        stringsArr.toArray(newStrArray);
        int newArrayLength=newStrArray.length;
        for(int i=0;i<newArrayLength;i++)
        {
            if(newStrArray[i].length()==numchars)
            {
                System.out.println(newStrArray[i]);
            }
        }

    return newStrArray;

    }
}
