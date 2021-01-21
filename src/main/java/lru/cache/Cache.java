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

    public void store(K key, V value) {
        if (this.cache.containsKey(key)) {
            this.cache.remove(key);
        } else if (this.cache.size() == this.capacity) {
            Iterator<K> it = this.cache.keySet().iterator();
            it.next();
            it.remove();
        }
        cache.put(key, value);
    }
}
