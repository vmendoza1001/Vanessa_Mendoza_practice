package SBA_Core_Java.Exercise1;

import SBA_Core_Java.Exercise1.IMyOperations;

import java.util.ArrayList;
import java.util.*;

public class MyOperation implements IMyOperations {
    ArrayList<String> myArrayList;

    public MyOperation (){
        this.myArrayList = new ArrayList<>();
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String string : stringArray) {
            this.myArrayList.add(string);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        this.myArrayList.set(index, "Nah");

    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        Iterator<String> iterator = this.myArrayList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element == "Nah") {
                iterator.remove();
            }
        }
       return this.myArrayList;

    }

}
