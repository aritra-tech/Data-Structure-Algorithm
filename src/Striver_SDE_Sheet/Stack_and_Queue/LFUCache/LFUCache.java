package Striver_SDE_Sheet.Stack_and_Queue.LFUCache;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LfuCache {
    private final Map<Integer, Integer> values = new HashMap<>();
    private final Map<Integer, Integer> counts = new HashMap<>();
    private final Map<Integer, LinkedHashSet<Integer>> frequency = new HashMap<>();

    private int capacity = -1;
    private int minFrequency = -1;

    public LfuCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!values.containsKey(key)) {
            return -1;
        }

        int keyCount = counts.get(key);
        counts.put(key, keyCount + 1);

        frequency.get(keyCount).remove(key);
        if (keyCount == minFrequency && frequency.get(keyCount).isEmpty()) {
            minFrequency++;
        }

        if (!frequency.containsKey(keyCount + 1)) {
            frequency.put(keyCount + 1, new LinkedHashSet<>());
        }
        frequency.get(keyCount + 1).add(key);

        return values.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }

        if (values.containsKey(key)) {
            values.put(key, value);
            get(key);
            return;
        }

        if (values.size() >= capacity) {
            int evicted = frequency.get(minFrequency).iterator().next();
            frequency.get(minFrequency).remove(evicted);
            values.remove(evicted);
            counts.remove(evicted);
        }

        values.put(key, value);
        counts.put(key, 1);
        minFrequency = 1;
        if (!frequency.containsKey(1)) {
            frequency.put(1, new LinkedHashSet<>());
        }
        frequency.get(1).add(key);
    }
}
/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */