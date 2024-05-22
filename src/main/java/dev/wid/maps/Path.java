package dev.wid.maps;

import java.util.List;
import java.util.stream.Stream;

public record Path(
        List<Segment> segments) {

    public float distance() {
        return segments.stream()
                .map(Segment::distance)
                .reduce(0f, Float::sum);
    }

    public boolean includesPoints(List<Point> points) {
        return segments.stream()
                .flatMap(s -> Stream.of(s.start(), s.end()))
                .distinct()
                .toList()
                .containsAll(points);
    }

}
