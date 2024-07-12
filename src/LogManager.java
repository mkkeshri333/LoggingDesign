import Entity.Logger;
import Service.LogingPlateform;

import java.util.List;

public class LogManager {

    public static void sendLogger(Logger logger , List<LogingPlateform> loggingPlateformList){
        for (LogingPlateform obj : loggingPlateformList){
            obj.savelogger(logger);
        }
    }
}
