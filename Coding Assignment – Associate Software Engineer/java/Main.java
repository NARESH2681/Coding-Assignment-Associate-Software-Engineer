import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        array = list.toArray(new Integer[list.size()]);
        System.out.println("Shuffled Array: " + Arrays.toString(array));

        String romanNumeral = "IX"; // Change this to the Roman numeral you want to convert
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);

        String input = "The quick brown fox jumps over the lazy dog"; // Change this to your input string
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        boolean[] alphabetCheck = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetCheck[c - 'a'] = true;
            }
        }

        for (boolean check : alphabetCheck) {
            if (!check) {
                return false;
            }
        }

        return true;
    }
}
