package SBA_Exercises;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("------------ Testing reading sample.txt -----");
            String header = String.format("%-20s%-20s%-10s%-10s", "Name", "Description", "Price", "Available Quantity");
            System.out.println(header);

            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("  ");
                String name = parts[0];
                String description = parts[1];
                double price = Double.parseDouble(parts[2]);
                int availableQuantity = Integer.parseInt(parts[3]);
                String formattedLine = String.format("%-20s%-20s%-10.2f%-10d", name, description, price, availableQuantity);
                System.out.println(formattedLine);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        System.out.println("\n---------- Testing the constructor of Item class ----------");

        Item item = new Item("Noodles", "really good", 20.00, 1, 20);
        String formattedItem = String.format("%-20s%-20s%-10.2f%-10d%-10d",
                item.getItemName(), item.getItemDescription(), item.getPrice(),
                item.getQuantity(), item.getAvailableQuantity());

        System.out.println(formattedItem);

        System.out.println("\n---------- Testing the constructor of MySystem Class ----------");

        MySystem mySystem = new MySystem();

        mySystem.printCurrentHashMapItems();
    }
}
