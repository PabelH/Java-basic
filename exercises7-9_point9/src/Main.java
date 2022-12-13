import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> group = new ArrayList<>();
        String moreClients;


        group = readFile(group);



        boolean save = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add Client?: (y)i o (n)o:");
            moreClients = scanner.nextLine();

            if (moreClients.startsWith("y") || moreClients.startsWith("Y")) {
                Client client = new Client();
                System.out.println("Client name:\n");
                client.name = scanner.nextLine();

                int j= group.size();
                for (int i=0; i<j; i++){
                    if(client.name.equals(group.get(i).name)){
                        System.out.println("Client already exists, it will be updated.");
                        group.remove(i);
                        j--;i--;
                    }
                }
                System.out.println("Write the data:\n");
                writeData(client, scanner);
                group.add(client);
                save = true;
            }
        } while (moreClients.startsWith("y") || moreClients.startsWith("Y"));


        for (Client value : group) {
            System.out.println(value.name);
            for (HashMap.Entry<String, Double> element : value.data.entrySet()) {
                System.out.println(element.getKey() + " : " + element.getValue());
            }
        }
        if(save) saveFile(group);
    }


    private static ArrayList<Client> readFile(ArrayList<Client> group) {
        try {
            System.out.print("Reading file group... ");
            ObjectInputStream readingFile = new ObjectInputStream(
                    new FileInputStream("group.txt"));
            group = (ArrayList<Client>) readingFile.readObject();
            readingFile.close();
            System.out.println("ok!");
            System.out.println("Data read from file:");

        } catch (Exception e) {
            System.out.println("Empty Group\n" +e.getMessage());
        }
        return group;
    }

    private static void writeData(Client client, Scanner scanner) {
        String []personalData = {"Age", "Weight", "Height", "Body mass", "Waist"};
        try {
            for (String value : personalData){
                System.out.println(value);
                double q = scanner.nextDouble();
                client.data.put(value, q);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Error, please re-enter data!");
        }
    }
    private static void saveFile(ArrayList<Client> group) {
        try {
            System.out.print("Saving... ");
            ObjectOutputStream writingFile = new ObjectOutputStream(
                    new FileOutputStream("group.txt"));
            writingFile.writeObject(group);
            writingFile.close();
            System.out.println("ok!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}