package ArrayPractice;
/*Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers. Print out the value at the first index and the
last index using length - 1 as the index. Now try printing the value at index =
length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
produced. Now try to assign a value to the array index 5. You should get the
same type of exception.*/
public class Main4 {
    public static void main(String[] args) {
        int [] numbers = {10, 1, 84, 160, 23};

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length]);

    }
}
