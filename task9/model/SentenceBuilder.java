package task9.model;

import java.util.ArrayList;
import java.util.List;

public class SentenceBuilder {

private List<Sentence> sentenceList;

    public SentenceBuilder(String fullText) {
        this.sentenceList = new ArrayList<>();
        makeSentences(fullText);
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    private void makeSentences(String fullText) {
        String[] sentences = fullText.split("(?<=\\w[.!?]{1,10})\\s+(?=\\w)");

        for (int i = 0; i < sentences.length; i++) {
            sentenceList.add(new Sentence(i, sentences[i].trim()));
        }
    }
}
