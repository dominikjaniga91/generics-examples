package stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStackTest {

    @Test
    public void isEmptyShouldReturnTrue_whenStackIsEmpty() {
        //given
        MyStack<String> stack = new MyStack<>();

        //when
        boolean actual = stack.isEmpty();

        //then
        Assert.assertTrue(actual, "Stack should be empty");
    }
}
