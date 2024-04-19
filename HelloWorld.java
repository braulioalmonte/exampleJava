import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = lector.nextInt();

        if( numero % 2 == 0 ){
            System.out.print("El número es par ");
        }

        else{
            System.out.print("El número es impar ");
        }
        lector.close();
    }
}
