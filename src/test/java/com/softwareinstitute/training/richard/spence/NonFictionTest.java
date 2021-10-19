package com.softwareinstitute.training.richard.spence;

import com.softwareinstitute.training.richard.spence.Fiction1;
import com.softwareinstitute.training.richard.spence.NonFiction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonFictionTest {


    @Test
    public void testgetDate() {
        NonFiction fiction = new NonFiction("Knausguard", "2012");
        fiction.setDate("2012");
        assertEquals("2012", fiction.getDate());
    }

}
