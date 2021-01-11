package hu.elte.math;

public class Vector {

    private final int[] elements;

    public Vector(int numberOfElements) { if (numberOfElements<1) throw new OwnUncheckedException("Invalid number of elements:" + numberOfElements);
        this.elements = new int[numberOfElements];
    }

    /**
     * Returns the sum of two vectors
     * @param other
     * @throws OwnUncheckedException different number of element
     */
    public void add(Vector other) {
        if(this.getLength()!=other.getLength()){
            throw new OwnUncheckedException("Add operation accepted incompatible vectors");
        }
        for (int i = 0; i < elements.length; i++) {
            elements[i] += other.elements[i];
        }
    }

    public int getElement(int index) {
        return elements[index];
    }

    public void setElement(int index, int element) {
        elements[index] = element;
    }

    public int getLength() {
        return elements.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i]);
            if (i != elements.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}