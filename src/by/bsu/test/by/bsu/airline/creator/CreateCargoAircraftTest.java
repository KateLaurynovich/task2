package by.bsu.airline.creator;

import by.bsu.airline.validator.LineValidator;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class CreateCargoAircraftTest {
    @Test
    public void testCeateCA() throws Exception {
        CreateCargoAircraft createCargoAircraft = new CreateCargoAircraft();
        String line = "0";
        String line2 = "LOCKHEED_C5_GALAXY lengthAircraft:75 heightAircraft:20 carrying:67300";
        ArrayList<String> list = new ArrayList<>();
        list.add(line);
        list.add(line2);
        LineValidator validator = new LineValidator();
        validator.listCA(list);
        createCargoAircraft.ceateCA(validator.listCA(list));

    }

}