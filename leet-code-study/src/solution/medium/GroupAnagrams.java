package solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    /*
     * 49. Group Anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rsltList = new ArrayList<>();

        if (strs == null || strs.length == 0) return rsltList;

        Map<String, List<String>> map = new HashMap<>();

        Arrays.stream(strs).forEach(i -> {
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);
            if (map.containsKey(key)) {
                map.get(key).add(i);
            } else {
                List<String> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
            }
        });

        map.keySet().forEach(key -> rsltList.add(new ArrayList<>(map.get(key))));

        return rsltList;
    }
}
