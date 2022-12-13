import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Reverse String


        System.out.println("\nReverse String\n");

        Scanner scanner0 = new Scanner(System.in);
        String txt;
        System.out.println("Write a text");
        txt = scanner0.nextLine();

        StringBuilder reverse = new StringBuilder(txt);
        txt = reverse.reverse().toString();

        System.out.println(txt);

        // one dimensional Array

        System.out.println("\n one dimensional Array \n");

        String[] texts = {"One ", "Two ", "Three ",  "Tamarind "};

        for (String txt1 : texts) {
            System.out.print(txt1);
        }

        //Two dimensional Array

        System.out.println("\n Two dimensional Array\n");

        Integer[][] number = {
                {5, 10, 15},
                {20, 25, 30}
        };

        for (int i = 0; i < number.length; i++) {

            for (int y = 0; y < number[i].length; y++) {

                System.out.println("Row: " + (i + 1) + " | Column: " + (y + 1) +
                        "\nValue " + number[i][y] + "\n");
            }
        }

        //Vector

        System.out.println(" \n Vector\n");

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Vector before: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector after: " + vector);



        //Answer point 4
        System.out.println("\n\n Answer point 4\n");

        System.out.println("\nQ: what is the problem of using a Vector with the default capacity if we had 1000 elements to be added to it?\n");

        System.out.println("A: When the established limit (10) is exceeded, the dimension of the vector doubles and this is quite costly in computing terms");


        // Array & LinkedList
        System.out.println("\n Array & LinkedList\n");

        ArrayList<String> list = new ArrayList<>();
        list.add("Water");
        list.add("Fire");
        list.add("Ground");
        list.add("Air");

        LinkedList<String> linkedListing = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            linkedListing.add(i, list.get(i));
        }

        System.out.println("Array elements:");
        for (String elements : list) {
            System.out.print(elements + " ");
        }

        System.out.println("\n\nLinkedList Elements:");
        for (String elements : linkedListing) {
            System.out.print(elements + " ");
        }


        //ArrayInt
        System.out.println("\n ArrayInt\n");

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list1.add(i);

            for (int num = 0; num < list1.size(); num++) {

                if (list1.get(num) % 2 == 0) {
                    //noinspection SuspiciousListRemoveInLoop
                    list1.remove(num);
                }
            }
        }

        System.out.println(list1);

        //Divide by Zero
        System.out.println("\n Divide by Zero\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers to divide: ");
        System.out.print("Number 1: ");
        int a = scanner.nextInt();
        System.out.print("Number 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("this can't be done try again...");
        } finally {
            System.out.println("Demo code");
        }

        // Copy file
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the source file: ");
        String fileIn = scanner1.nextLine();
        System.out.println("Enter the destination file: ");
        String fileOut = scanner1.nextLine();
        copy (fileIn, fileOut);



    }
    private static void copy (String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}