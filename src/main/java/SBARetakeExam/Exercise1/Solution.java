package SBARetakeExam.Exercise1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


    // <<<<<======== Click here to expand the locked stub. Please take a look at the locked stub code to better understand how your implementation of the required classes will be validated.
//PlEASE DO NOT ATTEMPT TO MODIFY THE CODE BELOW !!!!!!.
    public class Solution {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random rand = new Random(0);

            int n = Integer.parseInt(sc.nextLine());
            String[] a = new String[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLine();

            MyList obj = new ArrayToList();

            obj.convert(a);
            int x = rand.nextInt(n);
            for (int i = 0; i < x; i++)
                obj.replace(rand.nextInt(n));


            ArrayList<String> s = obj.compact();


            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122) {
                    try {
                        throw new InvalidStringException("This is an invalid string");
                    } catch (InvalidStringException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }


        }
    }

