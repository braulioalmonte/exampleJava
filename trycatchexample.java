import java.util.Scanner;

public class trycatchexample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int[] myNumbers = { 1, 2, 3 };
            String teString = scanner.nextLine();
            int number = Integer.parseInt(teString);
            System.out.println("Your number is " + number);
            System.out.println(myNumbers[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not present, the list is not that big.");
        }

        catch (NumberFormatException e){
            System.out.println("You entered a non-numeric value");
        }

        catch(ArithmeticException e){
            System.out.println("Operación matemática invalida");
        }
        
        catch (Exception e) {
            System.out.println("Something went wrong.");
        } 
        
        finally {
            System.out.println("The 'try catch' is finished.");
        }
        
        int age = scanner.nextInt();

        if (age < 18) {
            scanner.close();
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

        scanner.close();
    }
}
