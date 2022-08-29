#include <bits/stdc++.h>
#include <list>
#include <unordered_map>
using namespace std;

class LFUCache {
    
    inline static const int NO_SUCH_KEY = -1;
    size_t capacity;
    unordered_map<int, int> keyToValue;
    unordered_map<int, int> keyToFrequency;
    unordered_map<int, list<int>> frequencyToKey;

public:
    LFUCache(int capacity) {
        this->capacity = capacity;
    }

    int get(int key) {
        if (keyToValue.find(key) == keyToValue.end()) {
            return NO_SUCH_KEY;
        }

        int previousFrequency = keyToFrequency[key];
        keyToFrequency[key] = previousFrequency + 1;
        updateMapFrequencyToKey(previousFrequency, key);

        return keyToValue[key];
    }

    void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        if (keyToValue.size() == capacity && keyToValue.find(key) == keyToValue.end()) {
            int leastFrequentlyUsed = INT_MAX;
            for (const auto& frequency : frequencyToKey) {
                leastFrequentlyUsed = min(leastFrequentlyUsed, frequency.first);
            }
            removeLeastRecentlyUsedFromLeastFrequentlyUsed(leastFrequentlyUsed);
        }

        int previousFrequency = keyToFrequency.find(key) != keyToFrequency.end() ? keyToFrequency[key] : 0;
        keyToValue[key] = value;
        keyToFrequency[key] = previousFrequency + 1;
        updateMapFrequencyToKey(previousFrequency, key);
    }

private:
    void updateMapFrequencyToKey(int previousFrequency, int key) {
        if (frequencyToKey.find(previousFrequency + 1) == frequencyToKey.end()) {
            frequencyToKey[previousFrequency + 1] = list<int>();
        }
        frequencyToKey[previousFrequency + 1].push_back(key);

        if (frequencyToKey.find(previousFrequency) != frequencyToKey.end()) {
            frequencyToKey[previousFrequency].remove(key);
            if (frequencyToKey[previousFrequency].empty()) {
                frequencyToKey.erase(previousFrequency);
            }
        }
    }

    void removeLeastRecentlyUsedFromLeastFrequentlyUsed(int leastFrequentlyUsed) {
        int keyToRemove = frequencyToKey[leastFrequentlyUsed].front();
        frequencyToKey[leastFrequentlyUsed].pop_front();

        keyToValue.erase(keyToRemove);
        keyToFrequency.erase(keyToRemove);

        if (frequencyToKey[leastFrequentlyUsed].empty()) {
            frequencyToKey.erase(leastFrequentlyUsed);
        }
    }
};
/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache* obj = new LFUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */