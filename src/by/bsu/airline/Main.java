//package by.bsu.airline;
//
//import by.bsu.airline.creator.CreateAirline;
//import by.bsu.airline.creator.CreateCargoAircraft;
//import by.bsu.airline.creator.CreateNarrowBodyAircraft;
//import by.bsu.airline.creator.CreateWideBodyAircraft;
//import by.bsu.airline.entity.*;
//import by.bsu.airline.exception.AircraftException;
//import by.bsu.airline.parser.LineParser;
//import by.bsu.airline.reader.ReaderFromFile;
//import by.bsu.airline.validator.LineValidator;
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main {
//    private static final Pattern NUMBERS = Pattern.compile("[0-9]*");
//    private static final Logger LOGGER = LogManager.getLogger();
//    public static void main(String[] args) throws AircraftException {
//        ReaderFromFile readerFromFile = new ReaderFromFile();
//        LineValidator lineValidator= new LineValidator();
//        LineParser lineParser = new LineParser();
//        WideBodyAircraft wideBodyAircraft = new WideBodyAircraft();
//        CreateWideBodyAircraft createWideBodyAircraft = new CreateWideBodyAircraft();
//        NarrowBodyAircraft narrowBodyAircraft = new NarrowBodyAircraft();
//        CreateNarrowBodyAircraft createNarrowBodyAircraft = new CreateNarrowBodyAircraft();
//        CargoAircraft cargoAircraft = new CargoAircraft();
//        CreateCargoAircraft createCargoAircraft = new CreateCargoAircraft();
//
//
//
//        ArrayList<Aircraft> newList = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();
//        list = readerFromFile.readFile("resource/airline.txt");
////        LOGGER.log(Level.INFO, lineValidator.listWBA(list));
//        for (String line : lineValidator.listWBA(list)) {
//            wideBodyAircraft = createWideBodyAircraft.createWBA(lineParser.wideBodyAircraftParser(line));
//            newList.add(wideBodyAircraft);
//        }
//
//        for (String line : lineValidator.listNBA(list)) {
//
//            narrowBodyAircraft = createNarrowBodyAircraft.createNBA(lineParser.narrowBodyAircraftParser(line));
//            newList.add(narrowBodyAircraft);
//
//        }
//
//        for (String line : lineValidator.listCA(list)) {
//            cargoAircraft = createCargoAircraft.ceateCA(lineParser.cargoAircraftParser(line));
//            newList.add(cargoAircraft);
//        }
//
//            CreateAirline createAirline = new CreateAirline();
//            createAirline.createAirlaine(newList);
//        System.out.println(newList);
//
//
//            LOGGER.log(Level.INFO,newList);
//            Airline airline = createAirline.createAirlaine(newList);
//        newList.sort(Comparator.comparing(Aircraft::getHightAircraft).thenComparing((o1, o2)-> o1.getNameAircraft().compareToIgnoreCase(o2.getNameAircraft())));
////        newList.toString();
//
////        newList.sort(Comparator.comparing(Aircraft::getLangthAircraft).thenComparing((o1, o2)-> o1.getNameAircraft().compareToIgnoreCase(o2.getNameAircraft())));
////        newList.toString();
////        Comparator.comparing(Aircraft::getHightAircraft).thenComparing((o1, o2)-> o1.getNameAircraft().compareToIgnoreCase(o2.getNameAircraft()));
//
//        }
//
//}
