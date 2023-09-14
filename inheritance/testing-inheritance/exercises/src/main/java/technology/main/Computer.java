package technology.main;

public class Computer extends AbstractEntity {
    private int ScreenHeight;
    private int ScreenWidth;
    private int manufactureyear;

    //constructors

    public Computer(int screenHeight, int screenWidth, int manufactureyear) {
        this.ScreenHeight = screenHeight;
        this.ScreenWidth = screenWidth;
        this.manufactureyear = manufactureyear;
    }

    public int getScreenHeight() {
        return ScreenHeight;
    }

    public int getScreenWidth() {
        return ScreenWidth;
    }

    public int getManufactureyear() {
        return manufactureyear;
    }


}
