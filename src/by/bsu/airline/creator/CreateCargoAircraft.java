package by.bsu.airline.creator;

import by.bsu.airline.entity.Aircraft;
import by.bsu.airline.entity.CargoAircraft;
import by.bsu.airline.entity.WideBodyAircraft;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateCargoAircraft extends Aircraft {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern NUMBERS = Pattern.compile("[0-9]+");
    public CargoAircraft ceateCA(ArrayList<String> list){

        CargoAircraft cargoAircraft = new CargoAircraft();

        for (int i = 1; i < list.size(); i++) {

            Matcher matcher = NUMBERS.matcher(list.get(i));

            if (matcher.find()) {

                switch (i) {
                    case 0: {
                        cargoAircraft.setNameAircraft(list.get(0));
                    }

                    case 1:{
                        int temp = Integer.parseInt(matcher.group());
                        cargoAircraft.setLangthAircraft(temp);

                    }
                    break;
                    case 2: {
                        int temp = Integer.parseInt(matcher.group());
                        cargoAircraft.setHightAircraft(temp);

                    }
                    break;
                    case 3:{

                        int temp = Integer.parseInt(matcher.group());
                        cargoAircraft.setCarrying(temp);

                    }

                    break;

                    default:break;

                }
            }
        }
        LOGGER.log(Level.INFO, cargoAircraft.getNameAircraft(), cargoAircraft.getHightAircraft(),cargoAircraft.getLangthAircraft(), cargoAircraft.getCarrying());
        return cargoAircraft;

    }
}
