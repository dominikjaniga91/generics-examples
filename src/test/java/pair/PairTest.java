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
}
