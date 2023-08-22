package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args)
    {
        double PI=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius :");
        double r = input.nextDouble();

        //double area= PI * r * r ;
        double  area=Circle.getArea(r);
        System.out.println("Area of the  circle  is  : "  + area);

    }
}
