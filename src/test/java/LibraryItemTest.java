import com.softwareinstitute.training.richard.spence.Fiction1;
import com.softwareinstitute.training.richard.spence.LibraryItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryItemTest {

    @Test
    public void TestsetGenre() {
        LibraryItem item1 = new LibraryItem("Naked Lunch", 123, "SciFi");
        item1.setGenre("SciFi");
        assertEquals("SciFi", item1.getGenre());
    }

    @Test
    public void TestsetReference() {
        LibraryItem item1 = new LibraryItem("Naked Lunch", 123, "SciFi");
        item1.setReference(123);
        assertEquals(123, item1.getReference());
    }

    @Test
    public void TestsetName() {
        LibraryItem item1 = new LibraryItem("Naked Lunch", 123, "SciFi");
        item1.setName("Naked Lunch");
        assertEquals("Naked Lunch", item1.getName());

    }
}
