package lru.cache;

import java.util.*;

class Cache<K, V> {

    private final int capacity;
    private Map<K,V> cache;

    Cache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    boolean empty() {
        return cache.isEmpty();
    }

    int size() {
        return cache.size();
    }

    void store(K key, V value) {
        if (this.cache.size() == this.capacity) {
            Iterator<K> it = this.cache.keySet().iterator();
            it.next();
            it.remove();
        }
        cache.putIfAbsent(key, value);
    }

    V seek(K key) {
        V value = cache.get(key);
        cache.remove(key);
        cache.put(key, value);
        return value;
    }

    K firstKey() {
        return cache.keySet().stream().findFirst().orElse(null);
    }

    K lastKey() {
        Iterator<K> iterator = cache.keySet().iterator();
        K last = null;
        while (iterator.hasNext()) {
            last = iterator.next();
        }
        return last;
    }
}
