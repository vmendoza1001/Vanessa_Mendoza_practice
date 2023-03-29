package ArrayPractice;

/*      Write a program where you create an integer array of 5 numbers. Loop through
        the array and assign the value of the loop control variable multiplied by 2 to the
        corresponding index ;in the array.*/
public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {48, 84, 429, 74, 66};


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
            for (int i = 0; i < numbers.length; i++) {

                System.out.println(numbers[i]);
            }

    }
}
