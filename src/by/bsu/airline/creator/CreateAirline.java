package by.bsu.airline.creator;

import by.bsu.airline.entity.Aircraft;
import by.bsu.airline.entity.Airline;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;

public class CreateAirline {

    private static final Logger LOGGER = LogManager.getLogger();

    public Airline createAirlaine(ArrayList<Aircraft> aircrafts){
        Airline airline = new Airline();
        aircrafts.sort(Comparator.comparing(Aircraft::getLangthAircraft).thenComparing((o1, o2)-> o1.getNameAircraft().compareToIgnoreCase(o2.getNameAircraft())));
        aircrafts.sort(Comparator.comparing(Aircraft::getHightAircraft));
        airline.setAircraft(aircrafts);

        return airline;
       }

}
