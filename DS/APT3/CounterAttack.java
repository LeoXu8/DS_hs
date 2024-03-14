
import java.util.HashMap;
import java.util.Map;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] strWords = str.split("\\s+");
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : strWords) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        int[] result = new int[words.length];
        
        for (int i = 0; i < words.length; i++) {
            result[i] = wordCountMap.getOrDefault(words[i], 0);
        }
        
        return result;
    }

}

