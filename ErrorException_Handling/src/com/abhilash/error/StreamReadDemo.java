package com.abhilash.error;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StreamReadDemo {
    public static void main(String[] args) {
        List<Path> paths = List.of(Path.of("a.txt"), Path.of("b.txt"));

        // This does NOT compile because Files.readString throws IOException,
        // and Stream.map's Function does not declare any checked exception.
        // paths.stream().map(Files::readString).forEach(System.out::println);

        // The workaround is to wrap the checked exception in an unchecked one.
        paths.stream()
            .map(p -> {
                try {
                    return Files.readString(p);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            })
            .forEach(System.out::println);
    }
}