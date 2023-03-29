package ArrayPractice;
/* Read a line of text such as “I love Java.  You love Java. She loves Java.”
Split them into words
Count number of times each word (excluding dot .) occurs
So the end result is something like following: */

public class MainHomework {
    public static void main(String[] args) {
        String string = "I love Java.  You love Java. She loves Java.";
        String[] words = string.split(" ");
        String word = "I";
        int occurrences = 0;
        for (int i=0; i<words.length; i++)
            if (words[i].equals(word))
                occurrences++;
        System.out.println(occurrences);
    }
}
