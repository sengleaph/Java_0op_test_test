package OOP;
import java.lang.String;
class Engine{
    int powerLevel;
    String name;
    String makeIn;
    int year;

    Engine(int powerLevel, String name, String makeIn, int year){
        this.powerLevel=powerLevel;
        this.name = name;
        this.makeIn=makeIn;
        this.year=year;
    }

    @Override
    public String toString() {
        return "engine{" +
                "powerLevel=" + powerLevel +
                ", name='" + name + '\'' +
                ", makeIn='" + makeIn + '\'' +
                ", year=" + year +
                '}';
    }
}
class Car{
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    Engine engine;

    void  outPut() {
        System.out.println("Model"+model);
        System.out.println("Year"+year);

    }
    //    void engine(int year, String model){
//        this.model=model;
//        this.year=year;
//    }

}
public class Testing03 {
    public static void main(String[] args) {
        Car obj = new Car("newcar",2003);
     obj.outPut();

        obj.engine = new Engine(12,"tty","er",223);
        System.out.println( obj.engine.toString());


    }
}
