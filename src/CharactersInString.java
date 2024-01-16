import java.util.HashMap;
import java.util.Map;
public class CharactersInString {
    public static Map<Character, Integer> countCharacters(String string) {
        Map<Character, Integer> countCharactersMap = new HashMap<>();
        for (char character : string.toCharArray()) {
            if (Character.isLetter(character)) {
                countCharactersMap.put(character, countCharactersMap.getOrDefault(character, 0) + 1);
            }
        }
        return countCharactersMap;
    }
    public static void main(String[] args) {
        String inputString = "Sunny Day";
        Map<Character, Integer> countCharactersMap = countCharacters(inputString);
        countCharactersMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
