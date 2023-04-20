package SBA_Core_Java.Exercise2;

class MajorLeagueSoccer {
    private int[] playerNumberArray;

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }

    }

    public void sendPlayerToMinorLeague(int playerID) {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];
        if (playerIDInTheArray != -1) {
            playerNumberArray[index] = -1;
            System.out.println("Player is sent to the minor league");
        } else {
            System.out.println("Player is already on minor league");
        }
    }
    public void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        if (playerNumberArray[playerID - 1] > 0) {
            playerNumberArray[playerID - 1] = -1;
            System.out.println("Player " + playerID + " is transferred to " + destinationTeam);
        } else {
            System.out.println("Player " + playerID + " is no longer available");
        }
    }
}