package codewars.level6;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates_M {
    public static int duplicateCount(String text) {
        // Write your code here
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            // 將字符轉為小寫
            c = Character.toLowerCase(c);
            int count = letterCountMap.getOrDefault(c, 0);
            letterCountMap.put(c, count + 1);
        }
        int countDuplicate = 0;

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                countDuplicate++;
            }
        }
        return countDuplicate;

    }
}