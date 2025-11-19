import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubwayLine {

    public static boolean lineConnects(String startLine, String toLine) {
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
        } else if (startLine.equalsIgnoreCase("G")) {
            String doesNotConnect = "BbDdJjZzNnQqWw123456";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("J")) {
            String doesNotConnect = "17BbDdGg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("L")) {
            String doesNotConnect = "7";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("M")) {
            String doesNotConnect = "12345Gg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("N")) {
            String doesNotConnect = "Gg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("Q")) {
            String doesNotConnect = "Gg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("R")) {
                return true;
        } else if (startLine.equalsIgnoreCase("W")) {
            String doesNotConnect = "Gg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("Z")) {
            String doesNotConnect = "17BbDdGg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("1")) {
            String doesNotConnect = "JjMmEe456ZzGg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("2")) {
            String doesNotConnect = "GgMm";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("3")) {
            String doesNotConnect = "GgMm";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("4")) {
            String doesNotConnect = "1EeFfGgMm";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("5")) {
            String doesNotConnect = "1EeFfGgMm";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("6")) {
            String doesNotConnect = "123AaCcGg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("7")) {
            String doesNotConnect = "LlJjZz";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}