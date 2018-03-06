package task9.model;

import java.util.Objects;

public class Sentence {

    private int id;
    private String data;

    public Sentence() {
    }

    public Sentence(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public WordBuilder makeWords () {
        return new WordBuilder(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return id == sentence.id &&
                Objects.equals(data, sentence.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, data);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
