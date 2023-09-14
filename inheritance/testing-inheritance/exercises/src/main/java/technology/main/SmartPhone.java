package technology.main;

public class SmartPhone extends Computer{
    private String simNumber;
    public SmartPhone(int screenHeight, int screenWidth, int manufactureyear,String  simNumber) {
        super(screenHeight, screenWidth, manufactureyear);
        this.simNumber = simNumber;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setsimNumber()
    {
        System.out.println("SimNumber : "+this.simNumber);

    }
}
