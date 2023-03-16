package OOP;

import java.util.Scanner;

///base class, super class
class person{
    String name;
    String gender;
    String age ;
    String address;

    public person(String name, String gender, String address) {
    }

    void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the gender: ");
        gender = input.nextLine();
        System.out.print("Enter the age: ");
        age = input.nextLine();
        System.out.print("Enter the address: ");
        input.nextLine();
        address = input.nextLine();
    } void output(){
        System.out.println("==================");
        System.out.println("Name is: " +name);
        System.out.println("Gender is : " +gender);
        System.out.println("Age is : " +age);
        System.out.println("Address is : " +address);
    }
}
//sub class or child class
class student extends person{
    float average;
    String classname;
    void input(){
        Scanner input = new Scanner(System.in);

        super.input();
        System.out.println("Enter Average: ");
        average = input.nextFloat();
        System.out.println("Enter Classname: ");
        input.nextLine();
        classname = input.nextLine();
    }

    student(String name, String gender, int age, String address, float average, String classname){
        super(name, gender, address);
        this.average = average;
        this.classname= classname;
    }
    void output(){
        System.out.println("average is: " +average);
        System.out.println("classname is: " +classname);

    }
}

public class Testing01 {
    public static void main(String[] args) {
        //student obj = new student( );
//        person obj = new person();
         // obj.input();
        //  obj.output();

    }
}
