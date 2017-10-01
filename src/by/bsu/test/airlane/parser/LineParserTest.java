package by.bsu.test.airlane.parser;

import by.bsu.airline.parser.LineParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class LineParserTest {
    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void testCargoAircraftParser() throws Exception {
        String line = "AIRBUS_A300 lengthAircraft:53 heightAircraft:17 carrying:34200";
        LineParser lineParser = new LineParser();
        lineParser.cargoAircraftParser(line);
        LOGGER.log(Level.INFO, lineParser.cargoAircraftParser(line));
        lineParser.wideBodyAircraftParser(line);
        ArrayList<String> lineParser2 = new ArrayList<>();

        lineParser2.add("AIRBUS_A300");
        lineParser2.add("lengthAircraft:53");
        lineParser2.add("heightAircraft:17");
        lineParser2.add("carrying:34200");

        Assert.assertEquals(true, lineParser.cargoAircraftParser(line).equals(lineParser2));
    }

}