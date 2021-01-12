import java.util.ArrayList;
import java.util.List;

public class ArrayStack<T> implements Stack<T> {

    private final List<T> elements = new ArrayList<>();
    // alternative solutions exist: using array fix or resizable array, etc.

    public static <E extends Comparable> E min(ArrayStack<E> stack) {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("min element cannot be found in an empty stack");
        }
        E min = stack.elements.get(0);
        for (int i = 1; i < stack.elements.size(); i++) {
            E actual = stack.elements.get(i);
            if (actual.compareTo(min) < 0) {
                min = actual;
            }
        }
        return min;
    }

    public static <E extends Comparable> E max(ArrayStack<E> stack) {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("max element cannot be found in an empty stack");
        }
        E max = stack.elements.get(0);
        for (int i = 1; i < stack.elements.size(); i++) {
            E actual = stack.elements.get(i);
            if (actual.compareTo(max) > 0) {
                max = actual;
            }
        }
        return max;
    }

    @Override
    public void push(T element) {
        // no need for checking whether we have enough space in the underlying list, it will resize itself
        elements.add(element);
    }

    @Override
    public T pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("element cannot be popped from an empty stack");
        }
        T top = top();
        elements.remove(elements.size() - 1);
        return top;
    }
    
    @Override
    public T top() {
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