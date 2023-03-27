package ArrayPractice;

public class Main1 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3};

        int i;
        for (i = 0; i < myIntArray.length ; i++) {
            System.out.println(myIntArray[i]);
        }
        for (int myInt : myIntArray) {
            System.out.println(myInt);
        }
    }
}
