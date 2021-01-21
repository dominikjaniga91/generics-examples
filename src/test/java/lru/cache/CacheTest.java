package lru.cache;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

@Test(groups = "LRUCache")
public class CacheTest {

    private Cache<Integer, Integer> cache;

    @BeforeMethod
    public void setUp() {
       cache = new Cache<>(5);
    }

    @Test
    public void emptyShouldReturnTrue_whenCacheHasNoElements() {

        //when
        boolean actual = cache.empty();

        //then
        Assert.assertTrue(actual, "Cache should be empty");
    }

    @Test
    public void sizeShouldReturnZero_afterCreateNewCache() {

        //when
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 0, "Size should be equals to zero");
    }

    @Test
    public void sizeShouldReturnOne_afterStorePairToCache() {

        //when
        cache.store(1, 2);
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 1, "Size should be equals to one");
    }

    @Test
    public void sizeShouldReturnFive_afterStoreFivePairsToCache() {

        //when
        IntStream.rangeClosed(1, 5).forEach(i -> cache.store(i, i));
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 5, "Size should be equals to five");
    }

    @Test
    public void  sizeShouldReturnFive_afterStore10PairsToCache() {

        //when
        IntStream.rangeClosed(1, 10).forEach(i -> cache.store(i, i));
        int actual = cache.size();

        //then
        Assert.assertEquals(actual, 5, "Size should be equals to five");
    }

    @Test
    public void seekShouldReturnValueAssociatedWithKey() {

        //given
        int key = 5;
        int value = 10;
        cache.store(key, value);

        //when
        int actual = cache.seek(key);

        //then
        Assert.assertEquals(actual, value, "Value should be equals to " + value);
    }

    @Test
    public void seekShouldReturnNull_whenKeyDoesNoeExist() {

        //when
        Integer actual = cache.seek(5);

        //then
        Assert.assertNull(actual, "Value should be equals to null");
    }


    @Test
    public void shouldReturnFirstKeyEqualsToSix_afterAddTenPairs() {

        //given
        int expected = 6;

        //when
        IntStream.rangeClosed(1, 10).forEach(i -> cache.store(i, i));
        int actual = cache.firstKey();

        //then
        Assert.assertEquals(actual, expected, "First key should be equals to 6");
    }

    @Test
    public void shouldReturnLastKeyEqualsToTen_afterAddTenPairs() {

        //given
        int expected = 10;

        //when
        IntStream.rangeClosed(1, 10).forEach(i -> cache.store(i, i));
        int actual = cache.lastKey();

        //then
        Assert.assertEquals(actual, expected, "Last key should be equals to 10");
    }
}
