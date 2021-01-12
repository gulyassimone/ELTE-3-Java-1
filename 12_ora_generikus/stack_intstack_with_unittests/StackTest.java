import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void push_emptyStack() {
        // GIVEN
        Stack stack = new IntStack();

        // WHEN
        stack.push(1);

        // THEN
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, stack.top());
    }

    @Test
    public void push_notEmptyStack() {
        // GIVEN
        Stack stack = new IntStack();
        stack.push(1);

        // WHEN
        stack.push(2);

        // THEN
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(2, stack.top());
    }

    @Test(expected = IllegalStateException.class)
    public void pop_emptyStack() {
        // GIVEN
        Stack stack = new IntStack();

        // WHEN
        stack.pop();
    }

    @Test
    public void pop_singleElementStack() {
        // GIVEN
        Stack stack = new IntStack();
        stack.push(1);

        // WHEN
        int top = stack.pop();

        // THEN
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(1, top);
    }

    @Test
    public void pop_multiplePops() {
        // GIVEN
        Stack stack = new IntStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // WHEN
        int top1 = stack.pop();
        int top2 = stack.pop();
        int top3 = stack.pop();

        // THEN
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(3, top1);
        Assert.assertEquals(2, top2);
        Assert.assertEquals(1, top3);
    }

    
    @Test(expected = IllegalStateException.class)
    public void top_emptyStack() {
        // GIVEN
        Stack stack = new IntStack();

        // WHEN
        stack.top();
    }

    @Test
    public void top_singleElementStack() {
        // GIVEN
        Stack stack = new IntStack();
        stack.push(1);

        // WHEN
        int top = stack.top();

        // THEN
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, top);
    }

    @Test
    public void isEmpty_emptyStack() {
        // GIVEN
        Stack stack = new IntStack();

        // WHEN
        boolean isEmpty = stack.isEmpty();

        // THEN
        Assert.assertTrue(isEmpty);
    }

    @Test
    public void isEmpty_nonEmptyStack() {
        // GIVEN
        Stack stack = new IntStack();
        stack.push(1);

        // WHEN
        boolean isEmpty = stack.isEmpty();

        // THEN
        Assert.assertFalse(isEmpty);
    }
}