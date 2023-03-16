package OOP;



abstract class shape{
    abstract void draw();
}
class Rectangle extends shape{
    void draw(){
        System.out.println("rectangle");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("circle");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        shape sh;
        Rectangle rectangle = new Rectangle();
        sh = rectangle;
        sh.draw();

        circle circle = new circle();
        sh = circle;
        sh.draw();
    }
}
