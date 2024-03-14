public class TxMsg {
    public String getMessage(String original) {
        StringBuilder result = new StringBuilder();
        char[] originalChars = original.toCharArray();
        int i = 0;

        while (i < originalChars.length) {
            // If the current character is a space, add it to the result.
            if (originalChars[i] == ' ') {
                result.append(' ');
                i++;
            } else {
                // Find the end of the current word (sequence of alphabetic characters).
                int wordEnd = i;
                while (wordEnd < originalChars.length && Character.isAlphabetic(originalChars[wordEnd])) {
                    wordEnd++;
                }

                // Process the current word.
                String word = original.substring(i, wordEnd);

                if (isVowelWord(word)) {
                    // If the word contains only vowels, add it as is.
                    result.append(word);
                } else {
                    // If the word has consonants, encode it.
                    encodeWord(result, word);
                }

                i = wordEnd;
            }
        }

        return result.toString();
    }

    private boolean isVowelWord(String word) {
        for (char c : word.toCharArray()) {
            if (!isVowel(c)) {
                return false;
            }
        }
        return true;
    }

    private void encodeWord(StringBuilder result, String word) {
        boolean isPrevConsonant = false; // Define isPrevConsonant here

        for (char c : word.toCharArray()) {
            if (!isVowel(c)) {
                // If it's a consonant, add it only if there's no previous consonant.
                if (!isPrevConsonant) {
                    result.append(c);
                    isPrevConsonant = true;
                }
            }
            else{
                isPrevConsonant = false;
            }
        }
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
