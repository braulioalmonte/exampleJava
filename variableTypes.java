import java.util.ArrayList;
import java.util.HashMap;
public class variableTypes {
  
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int x = 5; //Integers
        double y = 2.5; //Doubles
        boolean isJavaFun = true; //booleans
        String greeting = "Hello, Java!"; //Strings
        int sum = x + 10; //Math operations
        int[] numbers = {1,2,3,4,5}; //Arrays
        String[] names = {"pepe", "grillo", "test"}; //Arrays
        HashMap<String, Integer> myHashExample = new HashMap<>(); //HashMaps, a.k.a Dictionaries
        myHashExample.put("Juan", 17);
        myHashExample.put("Pedro", 18);
        myHashExample.put("Maria", 19);

        //ArrayList<DataTypes> myList = new ArrayList<>();
        ArrayList<Object> myList = new ArrayList<>();

        myList.add(x);
        myList.add(y);
        myList.add(isJavaFun);
        myList.add(greeting);
        myList.add(sum);

        //for (DataType iteratorName : ArrayListName)
        for (Object element : myList){
            System.out.print(element + "\n");
        }
        System.out.print(numbers[0]);
        System.out.println(names[1]);
        System.out.println(myList.get(1));
        myList.set(1, 10);
    }
    
}
