package SBARetakeExam.Exercise2;

class Cricket implements Sport{

    private int[] playerIDs;

    public Cricket() {
        playerIDs = new int [11];
        for (int i = 0; i < 11; i++) {
            playerIDs[i] = i + 1;
        }
        String x = "A new cricket team has formed";
        System.out.println(x);
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0.0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double averageAge = sum / age.length;
        System.out.printf("The average age of the team is %.2f %n", averageAge);
    }

    @Override
    public void retirePlayer(int id) {
        int index = id - 1;
        if (playerIDs[index] == -1) {
            String x = "Player has already retired";
            System.out.println(x);
        }
        else {
            playerIDs[index] = -1;
            String x = "Player with id: " + id + " has retired";
            System.out.println(x);
        }
    }
}
