package chapter09.testing;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PointTest {

    @Test
    public void testMoveRightBy() throws Exception {
        Point p1 = new Point(5, 5);
        Point p2 = p1.moveRightBy(10);
        assertEquals(15, p2.getX());
        assertEquals(5, p2.getY());
    }

    @Test
    public void testComparingTwoPoints() throws Exception {
        Point p1 = new Point(10, 15);
        Point p2 = new Point(10, 20);
        int result = Point.compareByXAndThenY.compare(p1, p2);
        assertTrue(result < 10);
    }

    @Test
    public void testMoveAllPointRightBy() throws Exception {
        List<Point> points =
                Arrays.asList(new Point(5, 5), new Point(10, 5));
        List<Point> expectedPoints =
                Arrays.asList(new Point(15, 5), new Point(20, 5));
        List<Point> newPoints = Point.moveAllPointRightBy(points, 10);
        assertEquals(expectedPoints, newPoints);
    }

    @Test
    public void testFilter() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> even = numbers.stream().filter(i -> i % 2 == 0).collect(toList());
        List<Integer> smallerThanThree = numbers.stream().filter(i -> i < 3).collect(toList());
        assertEquals(Arrays.asList(2, 4), even);
        assertEquals(Arrays.asList(1, 2), smallerThanThree);

    }
}