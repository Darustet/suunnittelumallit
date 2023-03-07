import java.util.Arrays;
import java.util.Random;

class DiceGame extends Game {
 
    private int[] playerScores;
    private Random rand = new Random();
    private int winner;
    private boolean finishedRound;

    void initializeGame() {
        playerScores = new int[playersCount];
        Arrays.fill(playerScores, 0);
    }

    // Pelaajat heittävät kuusisivuista noppaa, kunnes pelaajan kaikkien heittojen yhteissumma on >= 100
    // Nykyinen kierros pelataan loppuun ja suurimman luvun saanut voittaa
    void makePlay(int player) {
        // Pelaaja heittää kahta noppaa
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        playerScores[player] += dice1 + dice2;
        System.out.println("Pelaajan " + (player + 1) + " heiton tulokset ovat " + dice1 + " ja " + dice2 
            + ", kokonaistulos on " + playerScores[player]);
        // Tarkistetaan ovatko kaikki heittäneet nykyisellä kierroksella
        if (player + 1 == playersCount) {
            finishedRound = true;
        } else {
            finishedRound = false;
        }
    }

    boolean endOfGame() {
        // Tarkistetaanko onko kierros ohi
        if (finishedRound) {
            // Etsitään johtava pelaaja ja tarkastetaan päättyykö peli
            int max = Arrays.stream(playerScores).max().getAsInt();
            if (max >= 100) {
                for (int i = 0; i<playersCount; i++) {
                    if (playerScores[i] == max) {
                        winner = i;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void printWinner() {
        System.out.println("Pelaaja " + (winner + 1) + " on voittaja " + playerScores[winner]
            + " pisteellä!");
        winner = 0;
    }
}
