import com.softwareinstitute.training.richard.spence.Fiction1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fiction1Test {

    @Test
    public void getDate() {
        Fiction1 fiction = new Fiction1("Knausguard","2012");
        assertEquals("2012",fiction.getDate());
    }

    @Test
    public void testGetDate() {
        Fiction1 fiction = new Fiction1("Knausguard","This is the Right one");
        assertEquals("This is the Right one","This is the Right one",fiction.getDate());
    }
}
