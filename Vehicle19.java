public interface Vehicle19 {
    public void look();
    public void seats();
}
class Car implements Vehicle19{
    @Override
    public void look() {
        System.out.println("Most of the cars are four wheels vehicle.");
    }

    @Override
    public void seats() {
        System.out.println("Usually car has 2 to 7 seats.");
    }
    public static void main(String[] args){
        Car obj = new Car();
        obj.look();
        obj.seats();
    }
}
