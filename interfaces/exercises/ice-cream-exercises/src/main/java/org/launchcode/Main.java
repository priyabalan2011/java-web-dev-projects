package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("Before sorting:\n");
        for(Flavor flavor : flavors)
        {
            System.out.println(flavor.getName() + "-" + flavor.getAllergens().size());
        }
        Comparator<Flavor> comparator = new FlavorComparator();
        flavors.sort(comparator);
        System.out.println("After sorting:\n");

        for(Flavor flavor : flavors)
        {
            System.out.println(flavor.getName()+ "-" + flavor.getAllergens().size());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        System.out.println("Before sorting:\n");
        for(Cone cone : cones)
        {
            System.out.println("$" + cone.getCost());
        }
        cones.sort(new ConeComparator());

        System.out.println("After sorting:\n");
        for(Cone cone : cones)
        {
            System.out.println("$" +cone.getCost());
        }

        // TODO: toppings sort by tastiness ascending order

        System.out.println("Before sorting:\n");
        for(Toppings topping : toppings)
        {
            System.out.println(topping.getName() + " - " + topping.getTastiness());
        }
        toppings.sort(new ToppingComparator());

        System.out.println("After sorting:\n");
        for(Toppings topping : toppings)
        {
            System.out.println(topping.getName() + " - " + topping.getTastiness());
        }




        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}