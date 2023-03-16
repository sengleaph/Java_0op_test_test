
class  Shape{
    void draw(){
        System.out.println("Drawing Shape.");
    }
}

class  Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing Rectangle.");
    }
}

class  Triangle extends Shape {
    void draw(){
        System.out.println("Drawing Triangle.");
    }
}

class  Polymorphism02{
    public static void main( String args[ ] ){
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        shape = rectangle;
        shape.draw();

        Triangle triangle = new Triangle();
        shape = triangle;
        shape.draw();
    }
}