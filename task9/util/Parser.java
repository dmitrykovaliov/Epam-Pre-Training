package task9.util;

import task9.exception.NoTextException;
import task9.model.Text;

import java.io.*;

public class Parser implements Parsable {


    private Text text;

    private static Parser uniqueInstance;

    private Parser() {
        text = new Text();
    }

    public Text getText() {
        return text;
    }


    public static Parser getParser() {
        if (uniqueInstance == null) {
            uniqueInstance = new Parser();
        }

        return uniqueInstance;
    }


    @Override
    public void parse(String filePath) throws IOException, NoTextException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        if(in.ready()) {
            while (in.ready()) {
                text.getList().add(in.readLine());
            }
            if (in != null) {
                in.close();
            }
        } else {
            throw new NoTextException();
        }
    }

    @Override
    public void unparse(String filePath) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
        for (String s : text.getList()) {
            out.write(s);
            out.newLine();
        }
        if (out != null) {
            out.close();
        }
    }

}
