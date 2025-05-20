import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều", TriangleClassifier.classify(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", TriangleClassifier.classify(3, 3, 4));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    public void testNotTriangle1() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    public void testNotTriangle2() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    public void testNotTriangle3() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}

