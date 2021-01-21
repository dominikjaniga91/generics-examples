package stack;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.EmptyStackException;

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

    @Test
    public void isEmptyShouldReturnFalse_whenStackIsNotEmpty() {
        MyStack<String> stack = new MyStack<>();
        stack.push(STACK_ELEMENT);

        boolean actual = stack.isEmpty();

        Assert.assertFalse(actual, "The Stack should not be empty");
    }


    @Test
    public void stackSizeShouldBeEqualsToOne_afterPushElement() {
        MyStack<String> stack = new MyStack<>();
        stack.push(STACK_ELEMENT);
        int actual = stack.size();

        Assert.assertEquals(actual, 1, "The Stack should have size equals to one");
    }

    @Test
    public void popShouldReturnElement_afterAddToMyStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push(STACK_ELEMENT);

        String actual = stack.pop();

        Assert.assertEquals(actual, STACK_ELEMENT, "Push method should return added element");
    }

    @Test
    public void isEmptyShouldReturnTrue_afterPopElementFromMyStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push(STACK_ELEMENT);
        stack.pop();

        boolean actual = stack.isEmpty();

        Assert.assertTrue(actual, "Stack should be empty");
    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void popShouldThrowAnException_whenStackIsEmpty() {
        MyStack<String> stack = new MyStack<>();
        stack.pop();
    }
}
