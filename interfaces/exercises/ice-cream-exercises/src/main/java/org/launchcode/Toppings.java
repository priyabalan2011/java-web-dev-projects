package org.launchcode;

import java.util.ArrayList;

public class Toppings extends Ingredient{
    private int tastiness;
    public Toppings(String aName, double aCost, ArrayList<String> someAllergens,int tastiness) {
        super(aName, aCost, someAllergens);
        this.tastiness=tastiness;
    }

    public int getTastiness() {
        return tastiness;
    }

    public void setTastiness(int tastiness) {
        this.tastiness = tastiness;
    }
}
