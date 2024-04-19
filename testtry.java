import java.util.Scanner;

public class testtry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero del 19 para adelante");

        try {
            int num1 = Integer.parseInt(scanner.nextLine());
            int[] listaNumeros = { 1, 2, 3, 4, 5, 6 };
            int numero_seleccionado = listaNumeros[num1];

            scanner.close();

            if (num1 < 18 ){
                throw new Exception("");
            }
        }

        catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Ese numero no ta en la lita: " + error);
        }

        catch (NumberFormatException e){
            System.out.println("You entered a non-numeric value: " + e);
        }

        catch (Exception e) {
            System.out.println("Algo más salió mal: " + e);
        }

        finally {
            System.out.println("Adiós");
        }
        
    }
}
