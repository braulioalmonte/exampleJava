import java.util.Scanner;
public class methods {
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
        }
    public static void main(String[] args){

        //Method examples
        Scanner scanner = new Scanner(System.in);
        System.err.println("Inserte el primer numero");
        int number1 = scanner.nextInt();

        System.out.println("Inserte el segundo numero");
        int number2 = scanner.nextInt();
        
        int resultado = sum(number1, number2);
        scanner.close();
        System.out.println(resultado);

    } 
}
