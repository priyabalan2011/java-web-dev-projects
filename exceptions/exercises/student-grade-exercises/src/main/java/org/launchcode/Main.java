package org.launchcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
       System.out.println(Divide(25,5));


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        //System.out.println(CheckFileExtension(""));
        for(Map.Entry<String,String> student:studentFiles.entrySet())
        {
            System.out.println(CheckFileExtension(student.getValue()));
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!

        if(y<=0) {
            try {

                throw new ArithmeticException("Y value is below zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }

        return (x / y);
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        boolean str;
        if(fileName.equals("") || fileName.equals("null"))
        {
            try{
                throw  new Exception("Filename is empty");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return -1;
            }

        }
        str=fileName.contains(".java");

        if(str)
        {
                return 1;
        }
        else {
            return 0;
        }


    }
}