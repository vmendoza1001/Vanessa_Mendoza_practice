package ArrayPractice;
/*Write a program that returns the middle element in an array. Give the following
values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7*/

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {13, 5, 7, 68, 2};
        int n = numbers.length;
        int mid = n / 2;
        System.out.println("the middle element of array is: " + numbers[mid]);
    }

}
