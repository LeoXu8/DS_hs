
import java.util.HashMap;
import java.util.Map;

public class BigWord {
    public String most(String[] sentences) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");

            for (String word : words) {
                String lowercaseWord = word.toLowerCase();

                int frequency = wordFrequencyMap.getOrDefault(lowercaseWord, 0) + 1;
                wordFrequencyMap.put(lowercaseWord, frequency);

                if (frequency > maxFrequency) {
                    mostFrequentWord = lowercaseWord;
                    maxFrequency = frequency;
                }
            }
        }

        return mostFrequentWord;
    }

}

