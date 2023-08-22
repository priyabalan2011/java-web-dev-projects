package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  value of length:");
        float length = input.nextFloat();
        System.out.println("Enter the value of breath:");
        float breath= input.nextFloat();
        float areaOfRect =length * breath;
        System.out.println("Area of the rectangle is : " + areaOfRect);
    }
}
