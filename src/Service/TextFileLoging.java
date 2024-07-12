package Service;

import Entity.Logger;

public class TextFileLoging implements LogingPlateform {

    @Override
    public void savelogger(Logger logger) {
        System.out.println("logger save to file " + logger.getMessage());
    }
}
