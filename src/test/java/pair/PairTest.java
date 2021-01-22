package pair;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "Pair")
public class PairTest {

    @Test
    public void shouldReturnValueOfLeft_afterCalledGetLeft() {
        //given
        Pair<String, String> pair = new Pair<>("Left", "Right");
        String expected = "Left";

        //when
        String actual = pair.getLeft();

        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnValueOfRight_afterCalledGetRight() {
        //given
        Pair<String, String> pair = new Pair<>("Left", "Right");
        String expected = "Right";

        //when
        String actual = pair.getRight();

        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkIfTwoTheSamePairsAreEquals() {
        //given
        Pair<String, String> first = new Pair<>("Left", "Right");
        Pair<String, String> second = new Pair<>("Left", "Right");

        //then
        Assert.assertEquals(first, second);
    }

    @Test
    public void checkIfTwoNotTheSamePairsAreDifferent() {
        //given
        Pair<String, String> first = new Pair<>("Left", "Right");
        Pair<String, String> second = new Pair<>("Right", "Left");

        //then
        Assert.assertNotEquals(first, second);
    }

    @Test
    public void checkIfTwoPairsAreNotEquals_whenLeftsAreDifferent() {
        //given
        Pair<String, String> first = new Pair<>("Left", "Right");
        Pair<String, String> second = new Pair<>("Different", "Right");

        //then
        Assert.assertNotEquals(first, second);
    }

    @Test
    public void checkIfTwoPairsAreNotEquals_whenRightIsDifferent() {
        //given
        Pair<String, String> first = new Pair<>("Left", "Right");
        Pair<String, String> second = new Pair<>("Left", "Different");

        //then
        Assert.assertNotEquals(first, second);
    }

    @Test
    public void compareShouldReturnZero_whenPairsAreTheSame() {
        //given
        Pair<String, String> first = new Pair<>("Left", "Right");
        Pair<String, String> second = new Pair<>("Left", "Right");
        int expected = 0;

        //when
        int actual = first.compareTo(second);

        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareShouldReturnOne_whenFirstPairIsGreater() {
        //given
        Pair<Integer, Integer> first = new Pair<>(3, 3);
        Pair<Integer, Integer> second = new Pair<>(1, 1);
        int expected = 1;

        //when
        int actual = first.compareTo(second);

        //then
        Assert.assertEquals(actual, expected);
    }

}
