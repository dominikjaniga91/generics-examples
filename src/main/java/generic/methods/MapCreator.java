package generic.methods;

import java.util.Collections;
import java.util.Map;

class MapCreator {

    public static <K,V> Map<K,V> create(K key, V value) {
        return Collections.singletonMap(key, value);
    }
}
