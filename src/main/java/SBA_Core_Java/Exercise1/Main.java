package SBA_Core_Java.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {


        String[] myStringArrayTestValue = {"life", "is", "worth", "living", "with", "passion"};
        MyOperation myOperation = new MyOperation();
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);

        ArrayList<String> newArrayList = myOperation.createANewArrayListFromExistingArray();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            if (!scanner.hasNextInt()) {
                try {
                    throw new MyOwnException("Invalid integer");
                } catch (MyOwnException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                Integer newInt = scanner.nextInt();
                System.out.println(newInt);
            }

        }
    }
}
