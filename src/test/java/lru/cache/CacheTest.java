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

    @Test
    public void sizeShouldReturnZero_afterCreateNewCache() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(10);

        //when
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 0, "Store should return value after add pair");
    }

    @Test
    public void shouldReturnSizeOne_afterStorePairToCache() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(10);

        //when
        cache.store(1, 2);
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 1, "Store should return value after add pair");
    }
}
