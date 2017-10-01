package by.bsu.airline.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReaderFromFileTest {
    private static final Logger LOGGER = LogManager.getLogger();
    @Test
    public void testReadFile() throws Exception {
        ReaderFromFile readerFromFile = new ReaderFromFile();
        String fileName = "resource/airline.txt";
        readerFromFile.readFile(fileName);
        LOGGER.log(Level.INFO, readerFromFile.readFile(fileName));





    }

}