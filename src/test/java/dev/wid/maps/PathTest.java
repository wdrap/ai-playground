package dev.wid.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PathTest {

    @Test
    void distance() {
        var path = new Path(List.of(
            new Segment(Point.of(0, 0), Point.of(0, 1)),
            new Segment(Point.of(0, 1), Point.of(0, 2))
        ));

        assertEquals(2, path.distance());
    }
}
