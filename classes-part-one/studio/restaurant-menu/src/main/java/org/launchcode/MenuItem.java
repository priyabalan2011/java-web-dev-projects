package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private MenuItemCategory category;
    private boolean isNew;

    public MenuItem(double p, String d, MenuItemCategory c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(MenuItemCategory category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Double getPrice(){
        return price;
    }

    public MenuItemCategory getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public String getDescription() {
        return description;
    }

    public void PrintMenuItem()
    {
       // System.out.println("Single Item Details");
        System.out.println("Item Description: " +description);
        System.out.println("Price : " +price);
        System.out.println("Category : " +category);
        System.out.println("New :" +isNew);
    }
}
