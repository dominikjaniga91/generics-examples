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
}
