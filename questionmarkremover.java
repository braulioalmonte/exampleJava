import java.util.Scanner;
public class questionmarkremover {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please order something: ");
        String str = scanner.nextLine();
        int index = str.indexOf('?');

        if (index != -1) {
            System.out.println("Dish Description");
            System.out.println("Do you want to order it?");
            String choice = scanner.nextLine();
            int num = Integer.parseInt(choice.replaceAll("[^0-9]", ""));
            if (choice.equalsIgnoreCase("yes")){
                System.out.println("Ordering..." + num);
            }
            else{
                System.out.println("Not ordering then.");
            }
        } 
        else {
            System.out.println("Dish Ordered");
        }
        scanner.close();

    }
}
