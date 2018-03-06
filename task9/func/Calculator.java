package task9.func;

import task9.exception.NoTextException;
import task9.model.Sentence;
import task9.model.Word;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Calculator {

    public static Map<Integer, Sentence> orderSentences(List<Sentence> list) throws NoTextException {
        Map<Integer, Sentence> treeMap = new TreeMap<>();

        if (list != null) {
            for (Sentence sentence : list) {
                treeMap.put(sentence.makeWords().getWordList().size(), sentence);
            }

            return treeMap;
        } else {
            throw new NoTextException("Please check the initial text");
        }
    }

    public static String uniqueWord(List<Sentence> list) throws NoTextException {

        if (list != null) {

            Sentence firstSentence = list.get(0);

            List<Word> wordList = firstSentence.makeWords().getWordList();

            for (Word aWordList : wordList) {
                String word = aWordList.getData().toLowerCase();
                boolean isUniqueWord = true;

                for (int j = 1; j < list.size(); j++) {

                    List<Word> nextWordList = list.get(j).makeWords().getWordList();

                    for (Word aNextWordList : nextWordList) {

                        String nextWord = aNextWordList.getData().toLowerCase();
                        if (word.equals(nextWord)) {
                            isUniqueWord = false;
                            break;
                        }
                    }
                }

                if (isUniqueWord) {
                    return word;
                }
            }

            return "-1";

        } else {
            throw new NoTextException("Please check the initial text");
        }
    }
}


