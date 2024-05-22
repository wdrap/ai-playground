package dev.wid.maps;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public record PathList(
        List<Path> pathList) {

    public Path shortestPath() {
        return pathList.stream()
                .min(Comparator.comparing(Path::distance))
                .orElseThrow();
    }

    public Optional<Path> shortestPathIncludes(List<Point> points) {
        return pathList.stream()
                .filter(path -> path.includesPoints(points))
                .min(Comparator.comparing(Path::distance));
    }
}
