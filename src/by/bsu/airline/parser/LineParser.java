package by.bsu.airline.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class LineParser {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern NUMBERS = Pattern.compile("(\\d*\\.?\\d)+");

    public ArrayList<String> cargoAircraftParser (String line){
        ArrayList<String> cargoAircraft = new ArrayList<>();
            String[] split = line.split("\\s");
            int i = 0;
        for (String str: split) {
            cargoAircraft.add(split[i]);
            i++;
        }
        return cargoAircraft;
    }

    public ArrayList<String> wideBodyAircraftParser (String line){
        ArrayList<String> wideBodyAircraft = new ArrayList<>();
        String[] split = line.split("\\s");
        int i = 0;
        for (String str: split) {
            wideBodyAircraft.add(split[i]);
            i++;
        }
        LOGGER.log(Level.INFO, wideBodyAircraft);

        return wideBodyAircraft;
    }

    public ArrayList<String> narrowBodyAircraftParser (String line){
        ArrayList<String> narrowBodyAircraft = new ArrayList<>();
        String[] split = line.split("\\s");
        int i = 0;
        for (String str: split) {
            narrowBodyAircraft.add(split[i]);
            i++;
        }
        LOGGER.log(Level.INFO, narrowBodyAircraft);

        return narrowBodyAircraft;
    }


}
