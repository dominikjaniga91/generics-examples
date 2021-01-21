package stack;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "MyStack")
public class MyStackTest {

    public static final String STACK_ELEMENT = "stack element";

    @Test
    public void isEmptyShouldReturnTrue_whenStackIsEmpty() {
        //given
        MyStack<String> stack = new MyStack<>();

        //when
        boolean actual = stack.isEmpty();

        //then
        Assert.assertTrue(actual, "Stack should be empty");
    }


    @Test
    public void newStackShouldHaveSizeEqualsToZero() {
        MyStack<String> stack = new MyStack<>();

        int actual = stack.size();

        Assert.assertEquals(actual, 0, "The Stack should have size equals to zero");
    }

    @Test
    public void pushShouldReturnElement_afterAddToMyStack() {
        MyStack<String> stack = new MyStack<>();

        String actual = stack.push(STACK_ELEMENT);

        Assert.assertEquals(actual, STACK_ELEMENT, "Push method should return added element");
    }

}
