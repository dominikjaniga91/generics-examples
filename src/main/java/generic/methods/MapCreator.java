package generic.methods;

import java.util.Collections;
import java.util.Map;

class MapCreator {

    static <K,V> Map<K,V> create(K key, V value) {
        return Collections.singletonMap(key, value);
    }
}
