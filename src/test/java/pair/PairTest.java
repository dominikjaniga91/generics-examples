package pair;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "Pair")
public class PairTest {

    @Test
    public void shouldReturnValueOfLeft_afterCalledLeft() {
        //given
        Pair<String, String> pair = new Pair<>("Left", "Right");
        String expected = "Left";

        //when
        String actual = pair.getLeft();

        //then
        Assert.assertEquals(actual, expected);
    }
}
