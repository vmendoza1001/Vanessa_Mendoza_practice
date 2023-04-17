package SBA_Exercises;

import HashMapExercise.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class MySystem {
    private Map<String, Item> myItemsInHasMap;

    public MySystem() {
        this.myItemsInHasMap = new HashMap<>();
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("  ");
                String itemName = parts[0];
                String itemDescription = parts[1];
                double price = Double.parseDouble(parts[2]);
                int availableQuantity = Integer.parseInt(parts[3]);
                Item item = new Item(itemName, itemDescription, price, availableQuantity);
                myItemsInHasMap.put(itemName, item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void printCurrentHashMapItems() {
        for (String item: myItemsInHasMap.keySet()) {
            Item elementsInItem = myItemsInHasMap.get(item);
            System.out.printf("%-20s-20s%-10.2f-10d", elementsInItem.getItemName(),
                    elementsInItem.getItemDescription(), elementsInItem.getPrice(),
                    elementsInItem.getAvailableQuantity());
            System.out.println();
        }
    }

    public Item addItem(Item item) {
        if (myItemsInHasMap.containsKey((item.getItemName()))) {
            System.out.println(item.getItemName() + " is already present. Cannot be added.");
            return null;
        }else {
            myItemsInHasMap.put(item.getItemName(), item);
            return item;
        }
    }

    public Map<String, Item> getMyItemsInHasMap() {
        return myItemsInHasMap;
    }

    public void setMyItemsInHasMap(Map<String, Item> myItemsInHasMap) {
        this.myItemsInHasMap = myItemsInHasMap;
    }

}
