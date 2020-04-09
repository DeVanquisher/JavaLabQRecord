package Inheritance16;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.engine("car",60);
        obj.wheel("car",4);
        System.out.println("Car is very appropriate vehicle for family trip.");
    }
}
