import java.util.Scanner;

public class Employee17 {
    public void display(String name,int age,char bloodGroup,float height){
        System.out.println("Employee Name :"+name+"\nage :"+age+"\nBlood group :"+bloodGroup+"\nHeight :"+height);
    }
    public static void main(String[] args){
        String name;
        int age;
        char bloodGroup;
        float height;
        Employee17 obj = new Employee17();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name :");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter age :");
        age = sc.nextInt();
        System.out.println();
        System.out.print("Enter blood group :");
        bloodGroup = sc.next().charAt(0);
        System.out.println();
        System.out.print("Height :");
        height = sc.nextFloat();
        System.out.println();
        obj.display(name,age,bloodGroup,height);
    }
}
