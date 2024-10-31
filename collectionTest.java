package inlamningsuppgift_first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class collectionTest {

    @Test
    void testGetTotalChars() {
        collectionModules check = new collectionModules();
        check.countCharAndLine("abcde");
        check.countCharAndLine("fghij");
        assertEquals(10, check.getTotalChars());
    }

    @Test
    void testGetTotalLines() {
        collectionModules check = new collectionModules();
        check.countCharAndLine("abc");
        check.countCharAndLine("def");
        check.countCharAndLine("ghi");
        
        assertEquals(3, check.getTotalLines());
    }

    @Test
    void testGetLongestString() {
        collectionModules check = new collectionModules();
        check.longest.add("Worldasdadasdasdasd!");
        check.longest.add("1212312");
        check.checkString();
        assertEquals("Worldasdadasdasdasd!", check.getLongestString());
    }
}