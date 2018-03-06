package task9.util;

import task9.exception.NoTextException;

import java.io.IOException;

public interface Parsable {
    void parse(String filePath) throws IOException, NoTextException;
    void unparse(String filePath) throws IOException;
}
