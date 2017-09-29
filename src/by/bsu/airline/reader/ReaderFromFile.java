package by.bsu.airline.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReaderFromFile {

        public List<String> readFile(String fileName) {
            List<String> lines = null;
            try {
                lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            } catch (IOException e) {
            }
            return lines;
        }

}
