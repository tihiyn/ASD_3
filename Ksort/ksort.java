import java.util.Map;
import java.util.Set;

public class ksort {
    public String[] items;
    private final Map<Character, Integer> lettersIndexMap = Map.of(
        'a', 0,
        'b', 1,
        'c', 2,
        'd', 3,
        'e', 4,
        'f', 5,
        'g', 6,
        'h', 7
    );
    private final Set<Character> numbers = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

    public ksort() {
        items = new String[800];
    }

    public int index(String s) {
        if (isNotValid(s)) {
            return -1;
        }
        return hash(s);
    }

    public boolean add(String s) {
        if (isNotValid(s)) {
            return false;
        }
        items[hash(s)] = s;
        return true;
    }

    private int hash(String s) {
        return lettersIndexMap.get(s.charAt(0)) * 100
            + Integer.parseInt(String.valueOf(s.charAt(1))) * 10
            + Integer.parseInt(String.valueOf(s.charAt(2)));
    }

    private boolean isNotValid(String s) {
        if (s.length() != 3) {
            return true;
        }
        if (!lettersIndexMap.containsKey(s.charAt(0))) {
            return true;
        }
        return !numbers.contains(s.charAt(1)) || !numbers.contains(s.charAt(2));
    }
}


