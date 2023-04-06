package ArrayPractice;

public class Main7 {
    /*Write a program where you create an array of 5 elements. Loop through the
array and print the value of each element, except for the middle (index 2)
element.*/
    public static void main(String[] args) {
        int[] numbers = {22, 33, 44, 55, 66};
        int i;

        for (i = 0; i < numbers.length; i++) {
            if (i == 2) {
                continue;
            }

            System.out.println(numbers[i]);
        }
    }
}