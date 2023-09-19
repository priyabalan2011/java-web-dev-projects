package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {

        //return o1.getName().compareTo(o2.getName());

        //bonus mission..to sort Flavor objects by the number of allergens, from highest to lowest.
        if(o1.getAllergens().size() > o2.getAllergens().size())
        {
            return -1;
        }
        else if (o1.getAllergens().size() < o2.getAllergens().size())
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
