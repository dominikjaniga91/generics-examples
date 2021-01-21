package lru.cache;

import java.util.*;

class Cache<K, V> {

    private final int capacity;
    private LinkedHashMap<K,V> cache;

    public Cache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public boolean empty() {
        return cache.isEmpty();
    }

    public int size() {
        return cache.size();
    }
}
