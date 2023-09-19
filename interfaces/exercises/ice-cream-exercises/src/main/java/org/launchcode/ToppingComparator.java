package org.launchcode;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Toppings> {

    @Override
    public int compare(Toppings o1, Toppings o2) {
        if(o1.getTastiness() > o2.getTastiness())
        {
            return 1;
        }
        else  if(o1.getTastiness() < o2.getTastiness())
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}
