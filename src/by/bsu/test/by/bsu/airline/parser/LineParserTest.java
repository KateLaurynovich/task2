package by.bsu.airline.parser;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class LineParserTest {
    @Test
    public void testWideBodyAircraftParser() throws Exception {
        LineParser lineParser = new LineParser();
        String line = "0";
        String line2 = "AIRBUS_A320 lengthAircraft:38 heightAircraft:12 seating:150 businessClass:40 economyClass:110 carrying:16600\n";
        ArrayList<String> list = new ArrayList<>();

        list = lineParser.wideBodyAircraftParser(line2);

    }



}