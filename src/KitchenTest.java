import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KitchenTest {
    Kitchen kitchenWithThree;

    @Before
    public void setUp() {
        kitchenWithThree = new Kitchen();
        kitchenWithThree.add("blue corn");
        kitchenWithThree.add("white corn");
        kitchenWithThree.add("yellow corn");
    }

    @Test
    public void testConstructor() {
        Kitchen kitchen = new Kitchen();
        assertEquals(0, kitchen.size());
    }

    @Test
    public void testIsEmpty() {
        Kitchen kitchen = new Kitchen();
        assertTrue(kitchen.isEmpty());
    }

    @Test
    public void testAdd() {
        Kitchen kitchen = new Kitchen();
        kitchen.add("blue corn");
        assertEquals(1, kitchen.size());
    }

    @Test
    public void testPop() {
        assertEquals("yellow corn", kitchenWithThree.pop());
        assertEquals(2, kitchenWithThree.size());
        kitchenWithThree.pop();
        kitchenWithThree.pop();
        kitchenWithThree.pop();
    }

    @Test
    public void testContains() {
        assertTrue(kitchenWithThree.contains("white corn"));
    }

    @Test
    public void testSize() {
        assertEquals( 3, kitchenWithThree.size());
    }

    @Test
    public void testPrintAll() {
        kitchenWithThree.printAll();
    }
}
