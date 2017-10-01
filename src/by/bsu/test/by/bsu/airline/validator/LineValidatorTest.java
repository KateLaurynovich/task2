package by.bsu.airline.validator;

import by.bsu.airline.validator.LineValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class LineValidatorTest {
    private static final Logger LOGGER = LogManager.getLogger();
    @Test
    public void testValidatorLine() throws Exception {
        String line = "0";
        String line2 = "AIRBUS_A319 lengthAircraft:34 heightAircraft:12 seating:156 businessClass:40 economyClass:116 carrying:14000";
        ArrayList<String> list = new ArrayList<>();
        list.add(line);
        list.add(line2);
        LineValidator validator = new LineValidator();
        validator.validatorLine(list);
        Assert.assertEquals("["+line2+"]",validator.validatorLine(list).toString() );
        LOGGER.log(Level.INFO,validator.validatorLine(list) );

    }

    @Test
    public void testListWBA() throws Exception {
        String line = "0";
        String line2 = "AIRBUS_A319 lengthAircraft:34 heightAircraft:12 seating:156 businessClass:40 economyClass:116 carrying:14000";
        ArrayList<String> list = new ArrayList<>();
        list.add(line);
        list.add(line2);
        LineValidator validator = new LineValidator();
        validator.listWBA(list);
        Assert.assertEquals("["+line2+"]",validator.listWBA(list).toString() );
        LOGGER.log(Level.INFO,validator.listWBA(list) );
    }

    @Test
    public void testListNBA() throws Exception {
        String line = "0";
        String line2 = "BOEING747 lengthAircraft:70 heightAircraft:20 seating:580 businessClass:80 economyClass:300 firstClass:200 carrying:68600";
        ArrayList<String> list = new ArrayList<>();
        list.add(line);
        list.add(line2);
        LineValidator validator = new LineValidator();
        validator.listNBA(list);
        Assert.assertEquals("["+line2+"]",validator.listNBA(list).toString() );
    }


    @Test
    public void testListCA() throws Exception {
        String line = "0";
        String line2 = "LOCKHEED_C5_GALAXY lengthAircraft:75 heightAircraft:20 carrying:67300";
        ArrayList<String> list = new ArrayList<>();
        list.add(line);
        list.add(line2);
        LineValidator validator = new LineValidator();
        validator.listCA(list);
        Assert.assertEquals("["+line2+"]",validator.listCA(list).toString() );
    }

}