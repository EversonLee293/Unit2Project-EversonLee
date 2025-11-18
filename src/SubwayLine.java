import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubwayLine {
    private String linesDoesNotConnect;
    private String lineName;

    public boolean lineConnects(String startLine, String toLine) {
        if (startLine.equalsIgnoreCase("A")) {
            if (toLine.equalsIgnoreCase("6")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("B")) {
            if (toLine.equalsIgnoreCase("G") || toLine.equalsIgnoreCase("J") || toLine.equalsIgnoreCase("L") || toLine.equalsIgnoreCase("Z")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("C")) {
            if (toLine.equalsIgnoreCase("6")) {
                return false;
            } else {
                return true;
            }

        } else if (startLine.equalsIgnoreCase("D")) {
            if (toLine.equalsIgnoreCase("G") || toLine.equalsIgnoreCase("J") || toLine.equalsIgnoreCase("L") || toLine.equalsIgnoreCase("Z")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("E")) {
            if (toLine.equalsIgnoreCase("1") || toLine.equalsIgnoreCase("4") || toLine.equalsIgnoreCase("5")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("F")) {
            if (toLine.equalsIgnoreCase("1") || toLine.equalsIgnoreCase("4") || toLine.equalsIgnoreCase("5")) {
                return false;
            } else {
                return true;
            }
        }
        else if (startLine.equalsIgnoreCase("G")) {
            String doesNotConnect = "BDJZNQW123456";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}