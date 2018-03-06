package task9.model;

import java.util.ArrayList;
import java.util.List;

public class WordBuilder {
    private List<Word> wordList;

    public WordBuilder(String sentenceText) {
        this.wordList = new ArrayList<>();
        makeWords(sentenceText);
    }

    public List<Word> getWordList() {
        return wordList;
    }

    private void makeWords(String sentenceText) {
        String[] words = sentenceText.split("[^A-Za-z0-9_']+");

        for (int i = 0; i < words.length; i++) {
            wordList.add(new Word(i, words[i]));
        }
    }
}
