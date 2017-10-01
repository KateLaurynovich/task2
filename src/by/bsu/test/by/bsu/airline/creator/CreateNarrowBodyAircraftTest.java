package by.bsu.airline.creator;

import by.bsu.airline.parser.LineParser;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CreateNarrowBodyAircraftTest {
    @Test
    public void testCreateNBA() throws Exception {
        LineParser lineParser = new LineParser();
        String line = "0";
        String line2 = "AIRBUS_A320 lengthAircraft:38 heightAircraft:12 seating:150 businessClass:40 economyClass:110 carrying:16600\n";
        ArrayList<String> list;

        list = lineParser.narrowBodyAircraftParser(line2);
        System.out.println(list);
        CreateNarrowBodyAircraft createNarrowBodyAircraft = new CreateNarrowBodyAircraft();
        createNarrowBodyAircraft.createNBA(list);

    }

}