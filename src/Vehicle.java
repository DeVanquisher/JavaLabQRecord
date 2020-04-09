package Inheritance16;

public class Vehicle {
    public void wheel(String vehicleName, int wheels){
        System.out.println("Wheels help the vehicle to move and "+vehicleName+" usually required "+wheels);
    }
    public void engine(String vehicleName, int horsepower){
        System.out.println("Engine is the main part of a vehicle it covert the potential energy to kinetic energy\n"+vehicleName+" minimum required power is "+horsepower+" horsepower.");
    }
}
