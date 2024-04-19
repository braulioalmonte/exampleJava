import java.util.Scanner;
public class flowControl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int j = 0;
        if (x > 0) {
            System.out.println("x is positive");
        }
        else if (x == 1){
            System.out.println("One");
        }
        else {
            System.out.println("x is non-positive");
        }

        switch (x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not an option");
                break;
        }

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        while(j <= x){
            System.out.println(j);
            j++;
        }

        scanner.close();
        int m=1;
        int a =0;
        do {
            a++;
        } while(m < 0);

        System.out.println(a);
        
        
    }
}
