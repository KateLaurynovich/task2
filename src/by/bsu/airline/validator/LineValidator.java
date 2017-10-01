package by.bsu.airline.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String WBA_LINE_PATTERN = "([A-Z]+[_]?[A-Z]*[0-9]*[_]?[0-9]*[A-Z]*)\\s(\\s*\\w+:\\d+;?){6}[ ]*";
    private static final String NBA_LINE_PATTERN = "([A-Z]+[_]?[A-Z]*[0-9]*[_]?[0-9]*[A-Z]*)\\s(\\s*\\w+:\\d+;?){7}[ ]*";
    private static final String CA_LINE_PATTERN = "([A-Z]+[_]?[A-Z]*[0-9]*[_]?[0-9]*[A-Z]*)\\s(\\s*\\w+:\\d+;?){3}[ ]*";
    private static final String VALID_LINE = "([A-Z]+[_]?[A-Z]*[0-9]*[_]?[0-9]*[A-Z]*)*(([A-Z]+[_]?[0-9]*)*\\b(\\s*[a-zA-Z:]+\\s*\\d+\\.?\\d*;?\\s*|\\w+:\\s*\\w+)+)";


    public ArrayList<String> validatorLine (ArrayList<String> lines){
        ArrayList<String> list = new ArrayList<>();
        for (String line: lines ) {

            if (Pattern.matches(VALID_LINE,line)){
                list.add(line);
            }
            LOGGER.log(Level.INFO, "Invalid line in file for  Aircraft");
        }

        return list;
    }

    public ArrayList<String> listWBA(ArrayList<String> list){
        ArrayList<String> listWBA = new ArrayList<>();

        for (String line: list ) {

            if (Pattern.matches(WBA_LINE_PATTERN,line)){
                listWBA.add(line);
//                LOGGER.log(Level.INFO, line);
            }
            else {
//            LOGGER.log(Level.INFO, "Invalid line in file for Wide-Body Aircraft");
            }
        }
//        LOGGER.log(Level.INFO,list);
        return listWBA;
    }

    public ArrayList<String> listNBA(ArrayList<String> list){
        ArrayList<String> listNBA = new ArrayList<>();
        for (String line: list ) {
            if (Pattern.matches(NBA_LINE_PATTERN,line)){
                listNBA.add(line);
            }
            else {
//                LOGGER.log(Level.INFO, "Invalid line in file for Narrow-Body Aircraft");
            }
        }
        return listNBA;
    }

    public ArrayList<String> listCA(ArrayList<String> list){
        ArrayList<String> listCA = new ArrayList<>();
        for (String line: list ) {
            if (Pattern.matches(CA_LINE_PATTERN,line)){
                listCA.add(line);
            }
            else {
//                LOGGER.log(Level.INFO, "Invalid line in file for Cargo Aircraft");
            }
        }
        return listCA;
    }


}
