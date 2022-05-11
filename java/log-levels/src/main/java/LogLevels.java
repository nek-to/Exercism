import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    
    public static String message(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        if (logLine.contains("ERROR")){
            return logLine.replace("[ERROR]:", "").trim();
        }else if (logLine.contains("WARNING")){
            return logLine.replace("[WARNING]:", "").trim();
        } else if (logLine.contains("INFO")){
            return logLine.replace("[INFO]:", "").trim();
        } else return "";
    }

    public static String logLevel(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        if (logLine.contains("ERROR")){
            return "error";
        }else if (logLine.contains("WARNING")){
            return "warning";
        } else if (logLine.contains("INFO")){
            return "info";
        } else return "";
    }

    public static String reformat(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        if (logLine.contains("ERROR")){
            return logLine.replace("[ERROR]:", "").trim().concat(" (error)");
        }else if (logLine.contains("WARNING")){
            return logLine.replace("[WARNING]:", "").trim().concat(" (warning)");
        } else if (logLine.contains("INFO")){
            return logLine.replace("[INFO]:", "").trim().concat(" (info)");
        } else return "";
    }
}
