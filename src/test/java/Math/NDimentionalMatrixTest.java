package Math;
import org.example.Math.Matrix.Matrix;
import org.example.Math.Matrix.NDimensionalMatrix;
import org.example.Math.Vectors.NDimensionalVector;
import org.example.Math.Vectors.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NDimentionalMatrixTest {
    @Test
    public void testMatrixAddition() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix1 = new NDimensionalMatrix(v1, v2, v3);

        Vector v4 = new NDimensionalVector(1, 1, 1);
        Vector v5 = new NDimensionalVector(1, 1, 1);
        Vector v6 = new NDimensionalVector(1, 1, 1);

        NDimensionalMatrix matrix2 = new NDimensionalMatrix(v4, v5, v6);

        Matrix result = matrix1.addition(matrix2);

        Vector[] expected = new Vector[]{
                new NDimensionalVector(2, 3, 4),
                new NDimensionalVector(5, 6, 7),
                new NDimensionalVector(8, 9, 10)
        };

        assertArrayEquals(expected, result.getMatrixInVectors());
    }
    /*@Test
    public void testMultiplyVector() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix = new NDimensionalMatrix(v1, v2, v3);

        Vector vector = new NDimensionalVector(1, 1, 1);

        Vector result = matrix.multiplyVector(vector);

        Vector expected = new NDimensionalVector(12, 15, 18);

        assertEquals(expected, result);
    }

     */
    @Test
    public void testMultiplyMatrix() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix1 = new NDimensionalMatrix(v1, v2, v3);

        Vector v4 = new NDimensionalVector(1, 0, 0);
        Vector v5 = new NDimensionalVector(0, 1, 0);
        Vector v6 = new NDimensionalVector(0, 0, 1);

        NDimensionalMatrix matrix2 = new NDimensionalMatrix(v4, v5, v6);

        Matrix result = matrix1.multiplyMatrix(matrix2);

        Vector[] expected = new Vector[]{
                new NDimensionalVector(1, 2, 3),
                new NDimensionalVector(4, 5, 6),
                new NDimensionalVector(7, 8, 9)
        };

        assertArrayEquals(expected, result.getMatrixInVectors());
    }
    @Test
    public void testTransposition() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix = new NDimensionalMatrix(v1, v2, v3);

        Matrix result = matrix.transposition();

        Vector[] expected = new Vector[]{
                new NDimensionalVector(1, 4, 7),
                new NDimensionalVector(2, 5, 8),
                new NDimensionalVector(3, 6, 9)
        };

        assertArrayEquals(expected, result.getMatrixInVectors());
    }
    @Test
    public void testGetDeterminant() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix = new NDimensionalMatrix(v1, v2, v3);

        double result = matrix.getDeterminant();

        assertEquals(0, result, 0.0001);
    }
    @Test
    public void testInverseMatrix() {
        Vector v1 = new NDimensionalVector(1, 2);
        Vector v2 = new NDimensionalVector(3, 4);

        NDimensionalMatrix matrix = new NDimensionalMatrix(v1, v2);

        Matrix result = matrix.inverseMatrix();

        Vector[] expected = new Vector[]{
                new NDimensionalVector(-2, 1),
                new NDimensionalVector(1.5, -0.5)
        };

        assertArrayEquals(expected, result.getMatrixInVectors());
    }
    @Test
    public void testEquals() {
        Vector v1 = new NDimensionalVector(1, 2, 3);
        Vector v2 = new NDimensionalVector(4, 5, 6);
        Vector v3 = new NDimensionalVector(7, 8, 9);

        NDimensionalMatrix matrix1 = new NDimensionalMatrix(v1, v2, v3);
        NDimensionalMatrix matrix2 = new NDimensionalMatrix(v1, v2, v3);

        assertTrue(matrix1.equals(matrix2));
    }

}
