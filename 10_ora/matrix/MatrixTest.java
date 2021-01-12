import org.junit.Assert;
import org.junit.Test;
import math.Matrix;

public class MatrixTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        // GIVEN
        Matrix originalMatrix = new Matrix(2, 1);
        originalMatrix.setElement(1, 0, 0);
        originalMatrix.setElement(2, 1, 0);

        // WHEN
        Matrix clonedMatrix = originalMatrix.clone();
        originalMatrix.setElement(-1, 1, 0);

        // THEN
        Assert.assertEquals(1, clonedMatrix.getElement(0, 0));
        Assert.assertEquals(2, clonedMatrix.getElement(1, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidHeight() {
        new Matrix(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidWidth() {
        new Matrix(2, 0);
    }

    @Test
    public void testGetHeight() {
        // GIVEN
        Matrix matrix = new Matrix(3, 5);

        // WHEN
        int actualHeight = matrix.getHeight();

        // THEN
        Assert.assertEquals(3, actualHeight);
    }

    @Test
    public void testGetWidth() {
        // GIVEN
        Matrix matrix = new Matrix(3, 5);

        // WHEN
        int actualWidth = matrix.getWidth();

        // THEN
        Assert.assertEquals(5, actualWidth);
    }

    @Test
    public void testToString() {
        // GIVEN
        Matrix matrix = new Matrix(2, 2);
        matrix.setElement(1, 0, 0);
        matrix.setElement(2, 0, 1);
        matrix.setElement(3, 1, 0);
        matrix.setElement(4, 1, 1);

        // WHEN
        String representation = matrix.toString();

        // THEN
        Assert.assertEquals("1 2 | 3 4", representation);
    }
}