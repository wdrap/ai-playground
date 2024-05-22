package dev.wid.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    void testDistance_whenOtherIsNull() {
        var zeroPoint = Point.of(0, 0);

        assertThrows(NullPointerException.class, () -> zeroPoint.distance(null));
    }

    @Test
    void testDistance() {
        var zeroPoint = Point.of(0, 0);
        var point = Point.of(0, 1);

        assertEquals(point.distance(zeroPoint), 1);
    }
}
