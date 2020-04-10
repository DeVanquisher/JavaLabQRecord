abstract public class Animal {
    public abstract void animalSound(String name);

    public void legs(String animalName, int legs) {
        System.out.println(animalName + " has " + legs + " legs.");
    }

}
class Dog extends Animal{
    @Override
    public void animalSound(String name) {
        System.out.println(name+" Barks.");
    }
    public static void main(String[] args){
        String name = "Dog";
        int legs = 4;
        Dog obj = new Dog();
        obj.animalSound(name);
        obj.legs(name,legs);
    }
}
