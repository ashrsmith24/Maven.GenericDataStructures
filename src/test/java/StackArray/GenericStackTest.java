package StackArray;

import org.junit.Assert;
import org.junit.Test;

public class GenericStackTest {
    @Test
    public void testPushingGrowsTheStack() throws Exception {
        // Given an empty stack
        GenericStack<String> stack = new GenericStack<>();

        // Assert that it is empty.
        Assert.assertEquals(true, stack.isEmpty());
        // When we push something onto the stack
        stack.push("foobar");
        // Then it shouldn't be empty
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testPushingAndPoppingOrder() throws Exception {
        // Given
        GenericStack<String> stack = new GenericStack<>();
        // When
        stack.push("ash");
        stack.push("nae");
        // Then
        Assert.assertEquals("nae", stack.pop());
        Assert.assertEquals("ash", stack.pop());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopFirst() throws Exception {
        // Given
        GenericStack<String> stack = new GenericStack<>();
        // When
        stack.pop();
        // Then
    }

}