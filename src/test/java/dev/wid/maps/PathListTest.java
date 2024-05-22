package dev.wid.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class PathListTest {

    private Path shortestPath = new Path(List.of(
            new Segment(Point.of(0, 0), Point.of(1, 1)),
            new Segment(Point.of(1, 1), Point.of(2, 2))));

    private Path longestPath = new Path(List.of(
            new Segment(Point.of(0, 0), Point.of(0, 1)),
            new Segment(Point.of(0, 1), Point.of(0, 2)),
            new Segment(Point.of(0, 2), Point.of(1, 2)),
            new Segment(Point.of(1, 2), Point.of(2, 2))));

    @Test
    void shortestPath() {
        var pathList = new PathList(List.of(shortestPath, longestPath));

        assertEquals(shortestPath, pathList.shortestPath());
    }

    @Test
    void shortestPathIncludesPoint() {
        var shortestPath = new Path(List.of(
                new Segment(Point.of(0, 0), Point.of(1, 1)),
                new Segment(Point.of(1, 1), Point.of(2, 2))));

        var longestPath = new Path(List.of(
                new Segment(Point.of(0, 0), Point.of(0, 1)),
                new Segment(Point.of(0, 1), Point.of(0, 2)),
                new Segment(Point.of(0, 2), Point.of(1, 2)),
                new Segment(Point.of(1, 2), Point.of(2, 2))));

        var pathList = new PathList(List.of(shortestPath, longestPath));

        var points = List.of(
                Point.of(0, 1),
                Point.of(1, 2),
                Point.of(2, 2));

        Optional<Path> shortestPathFound = pathList.shortestPathIncludes(points);
        

        assertTrue(shortestPathFound.isPresent());

        assertEquals(longestPath, shortestPathFound.get());
    }
}
