package technology.main;


public class Laptop extends Computer{
    private String make;

    public Laptop(int screenHeight, int screenWidth, int manufactureyear, String make) {
        super(screenHeight, screenWidth, manufactureyear);
        this.make = make;
    }

    public String getMake() {
        return make;
    }


}

