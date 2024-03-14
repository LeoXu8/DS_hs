import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // Create a HashSet to store unique strings that meet the length requirement.
        HashSet<String> uniqueStrings = new HashSet<>();
        
        // Create a List to maintain the order of strings.
        List<String> resultList = new ArrayList<>();
        
        // Iterate through the input array.
        for (String str : list) {
            // Check if the string's length is greater than or equal to minLength.
            if (str.length() >= minLength) {
                // If the string is not already in the uniqueStrings set, add it to the set and resultList.
                if (uniqueStrings.add(str)) {
                    resultList.add(str);
                }
            }
        }
        
        // Convert the resultList to an array.
        String[] resultArray = new String[resultList.size()];
        resultList.toArray(resultArray);
        
        return resultArray;
    }
}
