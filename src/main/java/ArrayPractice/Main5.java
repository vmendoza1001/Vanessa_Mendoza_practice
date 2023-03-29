package ArrayPractice;
/*Write a program where you create an integer array with a length of 5. Loop
through the array and assign the value of the loop control variable (e.g., i) to
the corresponding index in the array.*/
public class Main5 {
    public static void main(String[] args) {
        int[] numbers = {21, 22, 23, 24, 25};

        for (int i = 0; i < numbers.length; i++)

            System.out.println(numbers[i]);

    }
}
