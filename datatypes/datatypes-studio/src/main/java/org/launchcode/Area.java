package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args)
    {
        double PI=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius :");
        //double r = input.nextDouble();
        double r=0;
        if(input.hasNextDouble() && r == Math.floor(r)  )
        {
            r = input.nextDouble();
            System.out.println(" int number");
            double  area=Circle.getArea(r);
            System.out.println("Area of the  circle  is  : "  + area);
        }
        else {
            System.out.println("You entered a wrong value");
            return;
        }
//        if(input.hasNextInt() || input.hasNextDouble() )
//        {
//            System.out.println(" a number");
//            //return;
//        }

        //double area= PI * r * r ;


    }
}
