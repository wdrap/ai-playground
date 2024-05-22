package dev.wid.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SegmentTest {

    @Test
    void testDistance() {
        var segment = new Segment(Point.of(0, 0), Point.of(0, 1));
        
        assertEquals(1, segment.distance());
    }
}
