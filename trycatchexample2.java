import java.util.Scanner;
public class trycatchexample2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dame un numero");
            int numero = scanner.nextInt();
            int[] myNumbers = { 1, 2, 3 };
            int myNumber = myNumbers[numero];
            System.out.println("Gracias por su numero");
            

            scanner.close();
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not present, the list is not that big.");

        }
        
        catch (Exception e) {
            System.out.println("Algo salió mal " + e);
        }
        finally{
            System.out.println("Adios");
        }
        
    }
}
