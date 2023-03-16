package OOP;

class Example{

    void main(int x, int y){
        System.out.println("the result between " +x+ " and " +y+ " are: " +(x+y));
    }
    void main (int x, int y, int z){
        System.out.println("the result between "+x+" + "+y+" + "+z+" are: "+ (x+y+z));
    }
    void main (String name1, String name2){
        System.out.println("the first person name: " +name1+" and next person name: "+name2);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Example exp = new Example();

        exp.main(15,20);
        exp.main(10,20,30);
        exp.main("Hey","Sweetie");
    }
}
