package technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone=new SmartPhone(300,200,2021,"314-484-1212");
        mySmartPhone.setsimNumber();
        int year=mySmartPhone.getManufactureyear();
        System.out.println("year: "+year);
        System.out.println("id:  "+mySmartPhone.getId());

        Laptop myLaptop=new Laptop(300,400,2022,"Intel");
        int yr=myLaptop.getManufactureyear();
        System.out.println("year :  "+yr);
        System.out.println("id:  "+myLaptop.getId());

        Computer myComputer=new Computer(200,300,2020);
        System.out.println("Year: "+ myComputer.getManufactureyear());
        System.out.println("id  : "+myComputer.getId());

    }


}
