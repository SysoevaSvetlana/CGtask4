import org.example.Math.NDimensionalVector;
import org.example.Math.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NDimensionalVectorTest {

    @Test
    public void testGetDimensional() {
        Vector vector = new NDimensionalVector(1, 2, 3);
        assertEquals(3, vector.getDimensional());
    }

    @Test
    public void testGetLength() {
        Vector vector = new NDimensionalVector(3, 4);
        assertEquals(5, vector.getLength(), 0.00000001);
    }

    @Test
    public void testGetArrValues() {
        Vector vector = new NDimensionalVector(1, 2, 3);
        assertArrayEquals(new double[]{1, 2, 3}, vector.getArrValues());
    }

    @Test
    public void testSubtraction() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(4, 5, 6);
        Vector result = vector1.subtraction(vector2);
        assertArrayEquals(new double[]{-3, -3, -3}, result.getArrValues());
    }

    @Test
    public void testAddition() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(4, 5, 6);
        Vector result = vector1.addition(vector2);
        assertArrayEquals(new double[]{5, 7, 9}, result.getArrValues());
    }

    @Test
    public void testScale() {
        Vector vector = new NDimensionalVector(1, 2, 3);
        Vector result = vector.scale(2);
        assertArrayEquals(new double[]{2, 4, 6}, result.getArrValues());
    }

    @Test
    public void testNormalization() {
        Vector vector = new NDimensionalVector(3, 4);
        Vector result = vector.normalization();
        assertArrayEquals(new double[]{0.6, 0.8}, result.getArrValues(), 0.00000001);
    }

    @Test
    public void testScalarProduct() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(4, 5, 6);
        double result = vector1.scalarProduct(vector2);
        assertEquals(32, result, 0.00000001);
    }

    @Test
    public void testCosAngleBetweenVectors() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(4, 5, 6);
        double result = vector1.cosAngleBetweenVectors(vector2);
        assertEquals(0.9608, result, 0.0001);
    }

    @Test
    public void testEquals() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(1, 2, 3);
        assertTrue(vector1.equals(vector2));
    }

    @Test
    public void testNotEquals() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(4, 5, 6);
        assertFalse(vector1.equals(vector2));
    }

    @Test
    public void testZeroVectorException() {
        Vector vector1 = new NDimensionalVector(0, 0, 0);
        Vector vector2 = new NDimensionalVector(1, 2, 3);
        assertThrows(ArithmeticException.class, () -> vector1.cosAngleBetweenVectors(vector2));
    }

    @Test
    public void testDifferentDimensionalVectorsException() {
        Vector vector1 = new NDimensionalVector(1, 2, 3);
        Vector vector2 = new NDimensionalVector(1, 2);
        assertThrows(ArithmeticException.class, () -> vector1.addition(vector2));
    }
}
