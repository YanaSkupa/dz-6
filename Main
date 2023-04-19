import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"мама", "тато", "їж їжак желе", "спасібі", "кожен", "інший", "майже"};
        char[] uniqueChars = findChars(words);
        System.out.println(uniqueChars);
    }

    public static boolean hasEvenOccurrences(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (set.contains(c)) {
                    set.remove(c);
                } else {
                    set.add(c);
                }
            }
        }
        return set.isEmpty();
    }

    public static char[] findChars(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (hasEvenOccurrences(words[i]) && hasEvenOccurrences(words[j])) {
                    char[] chars1 = words[i].toCharArray();
                    char[] chars2 = words[j].toCharArray();
                    Set<Character> set1 = new HashSet<>();
                    Set<Character> set2 = new HashSet<>();
                    for (char c : chars1) {
                        set1.add(c);
                    }
                    for (char c : chars2) {
                        set2.add(c);
                    }
                    Set<Character> uniqueSet = new HashSet<>(set1);
                    uniqueSet.addAll(set2);
                    for (char c : set1) {
                        if (set2.contains(c)) {
                            uniqueSet.remove(c);
                        }
                    }
                    char[] uniqueChars = new char[uniqueSet.size()];
                    int k = 0;
                    for (char c : uniqueSet) {
                        uniqueChars[k++] = c;
                    }
                    return uniqueChars;
                }
            }
        }
        return new char[0];
    }
}