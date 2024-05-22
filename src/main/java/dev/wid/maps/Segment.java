package dev.wid.maps;

public record Segment(
        Point start,
        Point end) {

    public float distance() {
        return start.distance(end);
    }

    private boolean includesPoint(Point point) {
        return start.equals(point) || end.equals(point);
    }
}
