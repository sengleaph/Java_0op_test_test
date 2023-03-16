//package OOP;
//
//import java.util.Scanner;
//
//public class TestCode {
//    String name;
//    String gender;
//    int age;
//
//    TestCode(){}
//        TestCode(String name, String gender, int age){
//            this.name = name;
//            this.gender = gender;
//            this.age = age;
//
//        }
//    void input(){
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the name: ");
//        name = input.nextLine();
//        System.out.println("Enter the gender: ");
//        gender = input.nextLine();
//        System.out.println("Enter the Age: ");
//        age = input.nextInt();
//
//    }
//    void output(){
//
//        System.out.println("Name: " +name);
//        System.out.println("Gender: " +gender);
//        System.out.println("Age: " +age);
//
//    }
//}
//class Worker extends TestCode{
//    int id;
//
//    float wage;
//    float hour;
//    float findSalary(){ return wage * hour; }
//
//    void TestCode(){}
//    void TestCode(int id, String name, String gender, int age, float wage, float hour ){
//        super(name, gender, age);
//        this.id = id;
//        this.wage = wage;
//        this.hour = hour;
//    }
//    void input (){
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Input ID: ");
//        id = input.nextInt();
//        super.input();
//        System.out.println("Input Wage: ");
//        wage = input.nextInt();
//        System.out.println("Input hour: ");
//        hour = input.nextInt();
//
//    }
//    void output(){
//        System.out.println("ID: " +id);
//        super.output();
//        System.out.println("Wage: " +wage);
//        System.out.println("hour: " +hour);
//        System.out.println("Salary is: " +findSalary());
//    }
//}
//public class Zee{
//    public static void main(String[] args) {
//        Worker worker = new Worker(1001, "james", "male", 12, 22, 10);
//        worker.output();
//    }
//}
//
