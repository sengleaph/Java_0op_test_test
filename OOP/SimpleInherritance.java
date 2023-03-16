package OOP;

public class SimpleInherritance {
    public static void main(String[] args) {
        SubClass ob1 =new SubClass();
        Object showmsgSuper = ob1.showmsgSuper;
        Object showmsgSub = ob1.showmsgSub;

    }
}
class SuperClass{
    public Object showmsgSuper;
    int i,j,k;
    void showmsgSuper(){
        System.
                out.println("this msg from superClass");
    }
}
class SubClass extends SuperClass{
    public Object showmsgSub;

    void showmsgSub(){
        System.out.println("this is msg for sub");
    }
}
