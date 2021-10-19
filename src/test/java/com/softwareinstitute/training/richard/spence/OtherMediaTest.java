package com.softwareinstitute.training.richard.spence;

import com.softwareinstitute.training.richard.spence.Fiction1;
import com.softwareinstitute.training.richard.spence.OtherMedia;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherMediaTest {
    @Test
    public void testgetMedia() {
        OtherMedia DVD = new OtherMedia("Donnie Darko","DVD");
        DVD.setMedia("DVD");
        assertEquals("DVD", DVD.getMedia());
    }
}
