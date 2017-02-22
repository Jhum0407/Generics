package humphrey.jeriah;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList<String> list1;
    MyArrayList<Integer>list2;


    @Before
    public void setUp(){
        list1 = new MyArrayList<>();
        list2 = new MyArrayList<>(7);
    }


    @Test
    public void MyArrayListSizeNoArgumentConstructorSize() {
        assertEquals(10, list1.size());
    }
    @Test
    public void MyArrayListSizeArgumentConstructorSize() {
        assertEquals(7, list2.size());
    }
    @Test
    public void addTest1(){
        list1.add("Dude");
        assertEquals(11,list1.size() );
    }
    @Test
    public void addTestData(){
        list1.add("Dude");
        assertEquals("Dude",list1.get(11) );
    }

    @Test
    public void addTest2(){
        list2.add(3);
        assertEquals(8,list2.size() );
    }

    @Test
    public void addTestIndex1(){
        list1.add( 5, "Johnny");
        assertEquals("Johnny",list1.get(5) );
    }

    @Test
    public void addTestIndex2(){
        list2.add( 5, 3);
        assertEquals(Integer.valueOf(3),list2.get(5) );
    }

    @Test
    public void setTest(){
        list1.set(3, "Buddy");
        assertEquals("Buddy", list1.get(3));
    }
    @Test
    public void setTest2(){
        int expected = 62;
       int actual = list2.set(3, 62);
        assertEquals(Integer.valueOf(expected), list2.get(3));
    }
    @Test
    public void removeTestElement(){
        for(int i = 1; i <=list1.size();i++){
            list1.set(i,"Element" + (i));
        }
        list1.remove("Element5");
        assertEquals("Element6", list1.get(5));
    }


    @Test
    public void removeTestIndex(){
        list1.add(4,"James");
        list1.add(5,"Michael");
        list1.add(6, "Jenny");
        list1.remove(5);
        assertEquals("Jenny", list1.get(5));
    }
    @Test
    public void removeTestresize() {
        list1.remove(5);
        assertEquals(9, list1.size());

    }

    @Test
    public void clearTest(){
        list1.clear();
        assertEquals(0, list1.size());
    }

    @Test
    public void containsTest(){
        for(int i = 1; i <=list1.size();i++){
            list1.set(i,"Element" + (i));
        }

        assertTrue(list1.contains("Element6"));
    }

    @Test
    public void isEmptyTest(){
        for(int i = 1; i <=list1.size();i++){
            list1.set(i,"Element" + (i));
        }

        assertFalse(list1.isEmpty());
    }
    @Test
    public void isEmptyTest2()  {
            list1.clear();
        assertTrue(list1.isEmpty());
    }

}