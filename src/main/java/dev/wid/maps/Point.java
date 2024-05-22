package dev.wid.maps;

import java.util.Objects;

public record Point(
    float x,
    float y
) {
    public static Point of(float x, float y) {
        return new Point(x, y);
    }

    public float distance(Point other) {
        Objects.requireNonNull(other);

        float dx = x - other.x;
        float dy = y - other.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
