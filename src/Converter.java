import java.util.HashMap;
import java.util.Map;

public class Converter{

    private static final Map<Character, Integer> LETTER_TO_NUMBER_MAP = createMap();

    private static Map<Character, Integer> createMap() {
        Map<Character, Integer> map = new HashMap<>();
        
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        map.put('ä', 27);
        map.put('ö', 28);
        map.put('ü', 29);
        map.put('ß', 30);

        return map;
    }

    public int[] lettersToNumbers(char[] letters) {
        int[] numbers = new int[letters.length];

        for (int i = 0; i < letters.length; i++){
            numbers[i] = LETTER_TO_NUMBER_MAP.get(letters[i]);
        }
        return numbers;
    }

    public char[] textToLetters(String text) {
        String cleanText = text.toLowerCase().replaceAll("[^a-zäöüß]", "");

        char[] letters = new char[cleanText.length()];
        for(int i = 0; i < letters.length; i++) {
            letters[i] = cleanText.charAt(i);
        }

        return letters;
    }
}