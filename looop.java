import java.util.Scanner;

public class looop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter N: ");
        int n = input.nextInt();

        for (int i=1; i<=n; i=i+2){
            System.out.print(" " +i);
            sum = sum + 1;
        }
        System.out.println("\n result of sum is: " +sum);
    }
}
