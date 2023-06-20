package homework9;

import static java.util.Arrays.sort;

public class Sentence {

    String[] words;

    public Sentence(String sentence) {
        this.words = sentence.split(" ");
    }

    public void printWordWithLeastUniqueChars() {
        String leastUniqueCharsWord = "";
        int leastUniqueChars = 0;

        for (String word : words) {
            int symbolsInWord = 1;
            char[] characters = word.toCharArray();

            sort(characters);

            for (int j = 1; j < characters.length; j++) {
                char character = characters[j];
                char prevCharacter = characters[j - 1];

                if (character != prevCharacter) {
                    symbolsInWord += 1;
                }
            }

            if (symbolsInWord < leastUniqueChars || leastUniqueChars == 0) {
                leastUniqueCharsWord = word;
                leastUniqueChars = symbolsInWord;
            }
        }
        System.out.println("The least unique symbols in word: " + leastUniqueCharsWord);
    }
}
