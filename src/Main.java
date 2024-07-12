import Entity.Category;
import Entity.Logger;
import Service.ConsoleLoging;
import Service.LogingPlateform;
import Service.TextFileLoging;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Logger logger1 = new Logger();
        logger1.setMessage("Exception while creating object");
        logger1.setCategory(Category.ERROR);

        LogingPlateform consoleLogging = new ConsoleLoging();

        LogingPlateform textFileLogging = new TextFileLoging();

        List<LogingPlateform> loggingPlateformList = new ArrayList<>();
        loggingPlateformList.add(consoleLogging);
        loggingPlateformList.add(textFileLogging);

        loggingPlateformList.add(consoleLogging);

        LogManager.sendLogger(logger1 , loggingPlateformList);

    }
}