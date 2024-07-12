package Service;

import Entity.Logger;

public class ConsoleLoging implements LogingPlateform {

    @Override
    public void savelogger(Logger logger) {
        System.out.println("logger saved to console" + logger.getMessage() + " " + logger.getCategory());

    }
}
