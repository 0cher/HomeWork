package HomeWork_9.Task_4;

import java.util.HashMap;
import java.util.Map;
public class ArrayToMap {
    public static <K> Map<K, Integer> arrayToMap_1(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            map.computeIfPresent(ks[i], (k,v) -> v+1);
            map.putIfAbsent(ks[i], 1);
        }
        return map;
    }
    public static <K> Map<K, Integer> arrayToMap_2(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K element : ks) {
            map.compute(element, (key, counter) -> counter == null ? 1 : counter + 1);
        }
        return map;
    }
    public static <K> Map<K, Integer> arrayToMap_3(K[] ks) {
        Map<K, Integer> map = new HashMap<K, Integer>();
        int count;
        for (int i = 0; i < ks.length; i++) {
            count = 0;
            for (int j = 0; j < ks.length; j++) {
                if (ks[i] == ks[j])
                    count++;
            }
            map.put(ks[i], count);
        }
        return map;
    }
}
