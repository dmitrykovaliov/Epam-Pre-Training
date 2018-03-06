package task9.model;

import java.util.Objects;

public class Word {

    private int id;
    private String data;

    public Word() {
    }

    public Word(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return id == word.id &&
                Objects.equals(data, word.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, data);
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
