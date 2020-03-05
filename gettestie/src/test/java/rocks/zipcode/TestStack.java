package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> testStack = new Stack<>();
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void stackTest2(){
        testStack.push("Word1");
        testStack.push("Word2");
        testStack.push("word3");
        testStack.pop();

        String expected = "Word2";
        String actual = testStack.peek();

        Assert.assertEquals(actual,expected);

    }
    @Test
    public void stackTest3(){
        testStack.push("Word1");
        testStack.push("Word2");
        testStack.push("word3");
        testStack.clear();

        boolean expected = true;
        boolean actual = testStack.empty();;

        Assert.assertEquals(actual,expected);

    }

    // Make a bigger test exercising more Stack methods.....
}
