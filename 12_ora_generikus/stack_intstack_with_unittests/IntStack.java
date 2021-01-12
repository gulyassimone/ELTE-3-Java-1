import java.util.ArrayList;
import java.util.List;

public class IntStack implements Stack {

    private final List<Integer> elements = new ArrayList<>();
    // alternative solutions exist: using array fix or resizable array, etc.

    @Override
    public void push(int element) {
        // no need for checking whether we have enough space in the underlying list, it will resize itself
        elements.add(element);
    }

    @Override
    public int pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("element cannot be popped from an empty stack");
        }
        int top = top();
        // look out! List<Integer> has remove(int) and remove(Integer) with different meaning!
        elements.remove(elements.size() - 1);
        return top;
    }
    
    @Override
    public int top() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("there is no top element on an empty stack");
        }
        return elements.get(elements.size() - 1);
    }
    
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

}