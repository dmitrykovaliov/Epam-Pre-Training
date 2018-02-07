package task2.task2_2;

public class Test {
    public static void main(String[] args) {
        char singeChar1 = 'A';
        char singeChar2 = 'Y';


        View.print("Vowel presence: " + Syllables.checkVowel1(singeChar1));
        View.print("Vowel presence: " + Syllables.checkVowel2(singeChar1));
        View.print("Vowel presence: " + Syllables.checkVowel3(singeChar1));
        View.print("Vowel presence: " + Syllables.checkVowel4(singeChar1) + "\n");

        View.print("Vowel presence: " + Syllables.checkVowel1(singeChar2));
        View.print("Vowel presence: " + Syllables.checkVowel2(singeChar2));
        View.print("Vowel presence: " + Syllables.checkVowel3(singeChar2));
        View.print("Vowel presence: " + Syllables.checkVowel4(singeChar2));

    }
}
