package codewars.level6;

import java.util.HashMap;

public class CountingDuplicates_S {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }
}
