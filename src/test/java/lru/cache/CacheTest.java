package lru.cache;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

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

    @Test
    public void shouldReturnSizeFive_afterStoreFivePairsToCache() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(10);

        //when
        IntStream.rangeClosed(1, 5).forEach(i -> cache.store(i, i));
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 5, "Store should return size equals to five ");
    }

    @Test
    public void shouldReturnSizeFive_afterStore10PairsToCache() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(5);

        //when
        IntStream.rangeClosed(1, 10).forEach(i -> cache.store(i, i));
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 5, "Store should return size equals to five ");
    }

    @Test
    public void seekShouldReturnValueAssociatedWithKey() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(5);
        int key = 5;
        int value = 10;
        cache.store(key, value);

        //when
        int actual = cache.seek(key);

        //then
        Assert.assertEquals(actual, value, "Seek should return value equals to " + value);
    }

    @Test
    public void seekShouldReturnNull_whenKeyDoesNoeExist() {

        //given
        Cache<Integer, Integer> cache = new Cache<>(5);

        //when
        Integer actual = cache.seek(5);

        //then
        Assert.assertNull(actual, "Seek should return value equals to -1");
    }
}
