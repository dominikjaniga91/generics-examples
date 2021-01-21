package lru.cache;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CacheTest {

    @Test
    public void emptyShouldReturnTrue_whenCacheHasNoElements() {
        //given
        Cache<Integer, Integer> cache = new Cache<>(10);

        //when
        boolean actual = cache.empty();

        //then
        Assert.assertTrue(actual, "Cache should be empty");
    }
}
