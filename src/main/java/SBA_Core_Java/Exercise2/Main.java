package SBA_Core_Java.Exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myNumberArray = {23, 12, 33, 47};
        int sum = 0;
        for (int number : myNumberArray) {
            sum += number;
        }
        double result = (double) sum / myNumberArray.length;
        System.out.printf("%.2f %n", result);

        MajorLeagueSoccer majorLeagueSoccer = new MajorLeagueSoccer();
        int [] playerNumberArray = majorLeagueSoccer.getPlayerNumberArray();
        String s = Arrays.toString(playerNumberArray);
        System.out.println(s);

        majorLeagueSoccer.sendPlayerToMinorLeague(4);

        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Tottenham");
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Napoli");
    }

}
