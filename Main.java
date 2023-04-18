import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 3, 4, 5, 6, 7};
        System.out.println(sumOfEvenNumbers(numbers));

        String str = "Alexx9800";
        printUniqueCharacters(str);
    }

    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static void printUniqueCharacters(String str) {
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char character : str.toCharArray()) {
            uniqueCharacters.add(character);
        }
        for (char character : uniqueCharacters) {
            System.out.println(character);
        }
    }
}