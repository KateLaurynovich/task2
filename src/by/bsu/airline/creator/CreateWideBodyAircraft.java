package by.bsu.airline.creator;

import by.bsu.airline.entity.WideBodyAircraft;
import by.bsu.airline.exception.AircraftException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateWideBodyAircraft {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern NUMBERS = Pattern.compile("[0-9]+");

    @Override
    public String toString() {
        return "CreateWideBodyAircraft{}";
    }

    public WideBodyAircraft createWBA(ArrayList<String> list) throws AircraftException {
        WideBodyAircraft wideBodyAircraft = new WideBodyAircraft();
        wideBodyAircraft.setNameAircraft(list.get(0));

        for (int i = 1; i < list.size(); i++) {

            Matcher matcher = NUMBERS.matcher(list.get(i));

            if (matcher.find()) {

                switch (i) {

                    case 1:{
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.setLangthAircraft(temp);

                    }
                        break;
                    case 2: {
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.setHightAircraft(temp);

                    }
                        break;
                    case 3:{
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.setSeating(temp);

                    }

                        break;
                    case 4:{
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.setBusinessClass(temp);


                    }
                        break;
                    case 5:{
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.getEconomyClass();

                    }

                        break;
                    case 6:{
                        int temp = Integer.parseInt(matcher.group());
                        wideBodyAircraft.setCarrying(temp);

                    }

                        break;
                    case 7:

                    default:break;

                }
            }
        }
        LOGGER.log(Level.INFO, wideBodyAircraft);
        return wideBodyAircraft;

    }



}