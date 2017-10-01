package by.bsu.airline.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ReaderFromFile {
    private static final Logger LOGGER= LogManager.getLogger();


        public ArrayList<String> readFile(String fileName) {
            List<String> lines = null;
            try {
                lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//                        readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            } catch (IOException e) {

                LOGGER.log(Level.FATAL, "Can't read data from file", e);

            }
            return (ArrayList<String>) lines;
        }

}
