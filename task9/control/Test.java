package task9.control;

import task9.exception.NoTextException;
import task9.func.Calculator;
import task9.util.Parser;
import task9.model.Sentence;
import task9.model.Text;
import task9.model.Word;
import task9.view.View;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws IOException {

        try {
            Parser parser = Parser.getParser();

            parser.parse("C:\\corejava\\epam1\\src\\task9\\text.txt");

            parser.unparse("C:\\corejava\\epam1\\src\\task9\\text2.txt");

            Text text = parser.getText();

            List<Sentence> list1 = text.makeSentences().getSentenceList();

            View.print("  Sentences: \n");

            for (Sentence sentence : list1) {
                View.print(sentence.toString());
            }

            View.print("\n  WordList: \n");

            for (Sentence sentence : list1) {
                List<Word> wordList = sentence.makeWords().getWordList();
                for (Word word : wordList) {
                    View.print(word.toString());
                }
            }


            View.print("\n  Sentences in ascending order of word quantity: \n");

            Map<Integer, Sentence> treeMap = Calculator.orderSentences(list1);

            for (Map.Entry<Integer, Sentence> integerSentenceEntry : treeMap.entrySet()) {
                View.print(integerSentenceEntry.getValue().getData());
            }

            View.print("\n  Unique word in first sentence: \n");

            String word = Calculator.uniqueWord(list1);
            View.print(word);

        } catch (NoTextException e) {
            e.printStackTrace();
        }


    }

}
