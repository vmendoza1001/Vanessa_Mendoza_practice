package ArrayPractice;
/*Write a program that creates an array of integers with a length of 3. Assign the
values 1, 2, and 3 to the indexes. Print out each array element.*/
public class Main1 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3};

        int i;
        for (i = 0; i < myIntArray.length ; i++) {
            System.out.println(myIntArray[i]);
        }

    }
}
