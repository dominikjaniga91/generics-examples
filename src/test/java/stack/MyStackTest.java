package stack;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.EmptyStackException;
import java.util.stream.IntStream;

@Test(groups = "MyStack")
public class MyStackTest {

    private static final String STACK_ELEMENT = "stack element";
    private MyStack<String> stack;

    @BeforeMethod
    public void setUp() {
        stack = new MyStack<>();
    }

    @Test
    public void isEmptyShouldReturnTrue_whenStackIsEmpty() {

        //when
        boolean actual = stack.isEmpty();

        //then
        Assert.assertTrue(actual, "Stack should be empty");
    }


    @Test
    public void newStackShouldHaveSizeEqualsToZero() {

        //when
        int actual = stack.size();

        //then
        Assert.assertEquals(actual, 0, "The Stack should have size equals to zero");
    }

    @Test
    public void pushShouldReturnElement_afterAddToMyStack() {

        //when
        String actual = stack.push(STACK_ELEMENT);

        //then
        Assert.assertEquals(actual, STACK_ELEMENT, "Push method should return added element");
    }

    @Test
    public void isEmptyShouldReturnFalse_whenStackIsNotEmpty() {

        //given
        stack.push(STACK_ELEMENT);

        //when
        boolean actual = stack.isEmpty();

        //then
        Assert.assertFalse(actual, "The Stack should not be empty");
    }


    @Test
    public void stackSizeShouldBeEqualsToOne_afterPushElement() {

        //given
        stack.push(STACK_ELEMENT);

        //when
        int actual = stack.size();

        //then
        Assert.assertEquals(actual, 1, "The Stack should have size equals to one");
    }

    @Test
    public void popShouldReturnElement_afterAddToMyStack() {

        //given
        stack.push(STACK_ELEMENT);

        //when
        String actual = stack.pop();

        //then
        Assert.assertEquals(actual, STACK_ELEMENT, "Push method should return added element");
    }

    @Test
    public void isEmptyShouldReturnTrue_afterPopElementFromMyStack() {
        //given
        stack.push(STACK_ELEMENT);
        stack.pop();

        //when
        boolean actual = stack.isEmpty();

        //then
        Assert.assertTrue(actual, "Stack should be empty");
    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void popShouldThrowAnException_whenStackIsEmpty() {
        stack.pop();
    }

    @Test
    public void peekShouldReturnElement_afterAddToMyStack() {
        //given
        stack.push(STACK_ELEMENT);

        //when
        String actual = stack.peek();

        //then
        Assert.assertEquals(actual, STACK_ELEMENT, "Peek method should return last element");
    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void peekShouldThrowAnException_whenStackIsEmpty() {
        stack.peek();
    }

    @Test
    public void shouldReturn25_afterIncreaseStackCapacity() {
        //given
        MyStack<Integer> stack = new MyStack<>();
        IntStream.rangeClosed(1, 25).forEach(stack::push);

        //when
        int actual = stack.size();

        //then
        Assert.assertEquals(actual, 25, "Stack capacity did not increase");
    }
}
