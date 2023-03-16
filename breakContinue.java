import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N: ");
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            if (i%2 == 0) continue;
            System.out.println(" " +i);

        }
        System.out.println();



        int valueA;
        int valueB;
        int valueC;
        int max;

        System.out.println("Enter value a: ");
        valueA = input.nextInt();
        System.out.println("Enter value b: ");
        valueB = input.nextInt();
        System.out.println("Enter value c: ");
        valueC = input.nextInt();

        if (valueA > valueB && valueA >valueC){
            max = valueA;
        }else if (valueB > valueA && valueB > valueC) {
            max = valueB;
        }else {
            max = valueC;
        }





    }
}
