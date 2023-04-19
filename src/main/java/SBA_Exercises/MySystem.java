package SBA_Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MySystem {
    private Map<String, Item> itemsInHashMap;

    public MySystem() {
        this.itemsInHashMap = new HashMap<>();
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("  ");
                String itemName = parts[0];
                String itemDescription = parts[1];
                double price = Double.parseDouble(parts[2]);
                int quantity = Integer.parseInt(parts[3]);
                Item item = new Item(itemName, itemDescription, price, quantity);
                itemsInHashMap.put(itemName, item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void printCurrentHashMapItems() {
        for (String item : itemsInHashMap.keySet()) {
            Item elementsInItem = itemsInHashMap.get(item);
            System.out.printf("%-20s %-20s %-10.2f %-10d", elementsInItem.getItemName(),
                    elementsInItem.getItemDescription(), elementsInItem.getPrice(),
                    elementsInItem.getAvailableQuantity());
            System.out.println();
        }
    }

    public Item addItem(Item item) {
        if (itemsInHashMap.containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already present. Cannot be added.");
            return null;
        } else {
            itemsInHashMap.put(item.getItemName(), item);
            return item;
        }
    }

    public Item removeItem(String itemName) {
        if (itemsInHashMap.containsKey(itemName)) {
            itemsInHashMap.remove(itemName);
            return itemsInHashMap.get(itemName);
        } else {
            return null;
        }

    public Item reduceAvailableQuantity(String itemName)
        if (itemsInHashMap.containsKey(itemName)) {
            Item item = itemsInHashMap.get(itemName);
            item.setAvailableQuantity(item.getAvailableQuantity() -1);
            if (item.getAvailableQuantity() == 0) {
                itemsInHashMap.remove(itemName);
            }
            return item;
        } else {
            return null;
        }
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return itemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.itemsInHashMap = myItemsInHashMap;
    }


}
