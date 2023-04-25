package SBARetakeExam.Exercise2;

class Football implements Sport{

    private int[] playerIDs;

    public Football() {
        playerIDs = new int [11];
        for (int i = 0; i < 11; i++) {
            playerIDs[i] = i + 1;
        }
        String x = "A new football team has formed";
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
        public void playerTransfer(int fee, int id) {
            int index = id - 1;
            if (playerIDs[index] == -1) {
                System.out.println("Player has already retired");
            } else {
                String x = "Player with id: " + id + " has been transferred with a fee of " + fee;
                System.out.println(x);
            }
        }
    }

