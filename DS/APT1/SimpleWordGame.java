import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> playerWords = new HashSet<>();

        for (String word : player) {
            playerWords.add(word);
        }

        int totalScore = 0;

        for (String word : dictionary) {
            if (playerWords.contains(word)) {
                int wordLength = word.length();
                int wordScore = wordLength * wordLength;
                totalScore += wordScore;

                playerWords.remove(word);
            }
        }

        return totalScore;
    }
}
