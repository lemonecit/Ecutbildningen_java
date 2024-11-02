package inlamningsuppgift_first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {
//Test and pass if first and second row are counted with 10 chars
    @Test
    void testGetTotalChars() {
        collectionModules check = new collectionModules();
        check.countCharAndLine("abcde");
        check.countCharAndLine("fghij");
        assertEquals(10, check.getTotalChars());
    }


    //Test and pass if rows will be counted in 3


    @Test
    void testGetTotalLines() {
        collectionModules check = new collectionModules();
        check.countCharAndLine("abc");
        check.countCharAndLine("def");
        check.countCharAndLine("ghi");

        assertEquals(3, check.getTotalLines());
    }
//Test and pass if this will match correct with our test value Worldasdadasdasdasd! is any of these rows with same as test value and pass with green sign
    @Test
    void testGetLongestString() {
        collectionModules check = new collectionModules();
        check.longest.add("Worldasdadasdasdasd!");
        check.longest.add("1212312");
        check.checkString();
        assertEquals("Worldasdadasdasdasd!", check.getLongestString());
    }
}