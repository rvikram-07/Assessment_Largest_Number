import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LargestOfThreeTest {
    private final LargestOfThree obj = new LargestOfThree();
    @Test public void largestFirst() { assertEquals(30, obj.largest(30, 20, 10)); }
    @Test public void largestSecond() { assertEquals(25, obj.largest(10, 25, 15)); }
    @Test public void largestThird() { assertEquals(40, obj.largest(10, 20, 40)); }
    @Test public void equal() { assertEquals(5, obj.largest(5, 5, 5)); }
}
