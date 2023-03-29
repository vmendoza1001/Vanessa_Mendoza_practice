
package ArrayPractice;

public class Main8 {
    /*Write a program that creates a String array of 5 elements and swaps the first
element with the middle element without creating a new array.*/
    public static void main(String[] args) {
        String [] arr = {"cheese", "bread", "donuts", "candy", "tuna"};

        System.out.println("Array before Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }

        String temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println("\n" + "Array after Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
    }
}
