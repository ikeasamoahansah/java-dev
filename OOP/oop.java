package OOP;

public class oop {

    public static void main(String[] args) {
        Car myCar = new Car();
        Garage garage = new Garage();

        System.out.println(myCar.make);
        myCar.brake();
        garage.park(myCar);
    }    
}


