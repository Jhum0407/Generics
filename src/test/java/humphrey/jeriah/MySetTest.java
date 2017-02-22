package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/22/17.
 */
public class MySetTest {
    MySet<Integer> set;

@Before
public void setUp(){
    set = new MySet<>();
}

@Test
    public void addTest1(){
    set.add(7);
    assertEquals(1, set.size());
}

@Test
public void containsTest(){
        set.add(7);
        assertTrue(set.contains(7));
}
    @Test
    public void addTestNoDuplicates(){
        set.add(7);
        set.add(7);
        assertEquals(1, set.size());
    }

    @Test
    public void clearTest(){
        set.add(6);
        set.add(55);
        set.add(543);
        set.clear();
        assertEquals(0, set.size());
    }

    @Test
    public void isEmptyTest(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void isEmptyTest2(){
        set.add(5);
        assertFalse(set.isEmpty());
    }

    @Test
    public void removeTest(){
        set.add(6);
        set.add(55);
        set.add(543);
        set.remove(55);
        assertEquals(Integer.valueOf(543), set.get(2));
    }
}