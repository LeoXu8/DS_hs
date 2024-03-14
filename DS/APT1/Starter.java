import java.util.HashSet;

public class Starter {
     public int begins(String[] words, String first) {
        String character = first.substring(0,1);
        HashSet<String> set = new HashSet();

        int count = 0;
        for (String word : words){
            if(!set.contains(word)){
                String firstletter = word.substring(0,1);
                if(firstletter.equals(character)){
                    count ++;
                }
            }
            set.add(word);
        }
        return count;
     }
 }