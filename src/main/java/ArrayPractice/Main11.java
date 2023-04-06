package ArrayPractice;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        int[] myIntArray = { 10, 1, 84, 2, 21, 64 };
        boolean searchResult = binarySearch(myIntArray, 6);
        System.out.println(searchResult);
    }

    private static boolean binarySearch(int[] myIntArray, int target) {

        Arrays.sort(myIntArray);


        int start = 0;

        int end = myIntArray.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (myIntArray[mid] == target) {
                return true;
            } else if (myIntArray[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}