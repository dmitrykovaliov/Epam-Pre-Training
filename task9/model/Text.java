package task9.model;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<String> list;

    public Text() {
        this.list = new ArrayList<>();
    }

    public List<String> getList() {
        return list;
    }

    //get text from lines
    public StringBuilder receiveText() {
        StringBuilder strBuild = new StringBuilder();

        for (String s : list) {
            strBuild.append(s).append(" ");
        }

        return strBuild;
    }

    public SentenceBuilder makeSentences() {
        return new SentenceBuilder(receiveText().toString());
    }

}
