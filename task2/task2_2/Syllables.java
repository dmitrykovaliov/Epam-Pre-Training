package task2.task2_2;

public class Syllables {

    public static final String VOWEL_SYLLABLES = "aeiouy";

    public static boolean checkVowel1(char a) {

        char c = Character.toLowerCase(a);

        char a1 = 'a';
        char a2 = 'e';
        char a3 = 'i';
        char a4 = 'o';
        char a5 = 'u';
        char a6 = 'y';

        return a1==c || a2==c || a3==c || a4==c || a5==c || a6==c;
    }



    public static boolean checkVowel2(char a) {

        String str = String.valueOf(a).toLowerCase();

        return VOWEL_SYLLABLES.contains(str);
    }



    public static boolean checkVowel3(char a) {

        String str = String.valueOf(a).toLowerCase();

        return str.matches("[aeiouy]");
    }



    public static boolean checkVowel4(char a) {

        String str = String.valueOf(a).toLowerCase();

        return str.matches("a|e|i|o|u|y");
    }

}
