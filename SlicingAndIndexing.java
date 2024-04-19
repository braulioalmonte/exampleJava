import java.util.Arrays;

public class SlicingAndIndexing {
    public static void main(String[] args) {
        // Problem 1
        int[] mylist1 = {1, 2, 3, 4, 5};
        int[] p1 = Arrays.copyOfRange(mylist1, 0, 3);

        // Problem 2
        int[] mylist2 = {1, 2, 3, 4, 5};
        int[] p2 = Arrays.copyOfRange(mylist2, mylist2.length - 3, mylist2.length);

        // Problem 3
        int[] mylist3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] p3 = new int[mylist3.length / 2];
        for (int i = 0, j = 0; i < mylist3.length; i += 2, j++) {
            p3[j] = mylist3[i];
        }

        // Problem 4
        int[] mylist4 = new int[20];
        for (int i = 0; i < 20; i++) {
            mylist4[i] = i + 1;
        }
        int[] p4 = Arrays.copyOfRange(mylist4, 6, 20);

        // Problem 5
        int[] mylist5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] p5 = new int[mylist5.length];
        for (int i = mylist5.length - 1, j = 0; i >= 0; i--, j++) {
            p5[j] = mylist5[i];
        }

        // Problem 6
        int[] mylist6 = {1, 2, 3, 4, 5};
        int p6 = mylist6[1];

        // Problem 7
        String[] mylist7 = {"a", "b", "c", "d", "e"};
        String p7 = mylist7[3];

        // Print the results
        System.out.println("Problem 1: " + Arrays.toString(p1));
        System.out.println("Problem 2: " + Arrays.toString(p2));
        System.out.println("Problem 3: " + Arrays.toString(p3));
        System.out.println("Problem 4: " + Arrays.toString(p4));
        System.out.println("Problem 5: " + Arrays.toString(p5));
        System.out.println("Problem 6: " + p6);
        System.out.println("Problem 7: " + p7);
    }
}
