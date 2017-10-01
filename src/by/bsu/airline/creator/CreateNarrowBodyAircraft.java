package by.bsu.airline.creator;

import by.bsu.airline.entity.Aircraft;
import by.bsu.airline.entity.NarrowBodyAircraft;
import by.bsu.airline.entity.WideBodyAircraft;
import by.bsu.airline.exception.AircraftException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateNarrowBodyAircraft extends Aircraft{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern NUMBERS = Pattern.compile("[0-9]+");



    public NarrowBodyAircraft createNBA(ArrayList<String> list) throws AircraftException {
            NarrowBodyAircraft narrowBodyAircraft = new NarrowBodyAircraft();
        narrowBodyAircraft.setNameAircraft(list.get(0));

        for (int i = 1; i < list.size(); i++) {

            Matcher matcher = NUMBERS.matcher(list.get(i));

            if (matcher.find()) {

                switch (i) {

                    case 1:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setLangthAircraft(temp);

                    }
                    break;
                    case 2: {
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setHightAircraft(temp);

                    }
                    break;
                    case 3:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setSeating(temp);

                    }

                    break;
                    case 4:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setBusinessClass(temp);


                    }
                    break;
                    case 5:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.getEconomyClass();

                    }

                    break;
                    case 6:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setFirstClass(temp);

                    }

                    break;
                    case 7:{
                        int temp = Integer.parseInt(matcher.group());
                        narrowBodyAircraft.setCarrying(temp);

                    }
                    default:
                        break;
                }
            }
        }
        LOGGER.log(Level.INFO, narrowBodyAircraft);
        return narrowBodyAircraft;
    }

}
