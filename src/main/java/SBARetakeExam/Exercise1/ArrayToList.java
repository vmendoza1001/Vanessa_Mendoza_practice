package SBARetakeExam.Exercise1;

import java.util.ArrayList;

class ArrayToList implements MyList {

    ArrayList<String> arrayToList;

    public ArrayToList() {
        arrayToList = new ArrayList<String>();
    }

    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            String x = "I have added the string: " + a[i] + " at the index: " + i;
            System.out.println(x);

        }
    }

    @Override
    public void replace(int idx) {
        String oldString = arrayToList.get(idx);
        arrayToList.set(idx, "");
        String x = "I have replaced the string: " + oldString + " with a null string";
        System.out.println(x);

    }

    @Override
    public ArrayList<String> compact() {
        ArrayList<String> newArrayList = new ArrayList<>();
        for (String s : arrayToList) {
            if (!s.equals("")) {
                newArrayList.add(s);
            }
        }
        return newArrayList;
    }
}
