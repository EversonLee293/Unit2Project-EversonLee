import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubwayLine {

    public static boolean lineConnects(String startLine, String toLine) {
        if (startLine.equalsIgnoreCase("A")) {
            if (toLine.equalsIgnoreCase("6") || toLine.equalsIgnoreCase("A")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("B")) {
            if (toLine.equalsIgnoreCase("G") || toLine.equalsIgnoreCase("J") || toLine.equalsIgnoreCase("L") || toLine.equalsIgnoreCase("Z") || toLine.equalsIgnoreCase("B")) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("C")) {
            if (toLine.equalsIgnoreCase("6") || toLine.equalsIgnoreCase("C")) {
                return false;
            } else {
                return true;
            }

        } else if (startLine.equalsIgnoreCase("D")) {
            if (toLine.equalsIgnoreCase("G") || toLine.equalsIgnoreCase("J") || toLine.equalsIgnoreCase("L") || toLine.equalsIgnoreCase("Z") || toLine.equalsIgnoreCase("D")) {
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
            String doesNotConnect = "BbDdJjZzNnQqWw123456Gg";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("J")) {
            String doesNotConnect = "17BbDdGgJj";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("L")) {
            String doesNotConnect = "7Ll";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("M")) {
            String doesNotConnect = "12345GgMm";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("N")) {
            String doesNotConnect = "GgNn";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("Q")) {
            String doesNotConnect = "GgQq";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("R")) {
            String doesNotConnect = "Rr";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("W")) {
            String doesNotConnect = "GgWw";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equalsIgnoreCase("Z")) {
            String doesNotConnect = "17BbDdGgZz";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("1")) {
            String doesNotConnect = "JjMmEe456ZzGg1";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("2")) {
            String doesNotConnect = "GgMm2";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("3")) {
            String doesNotConnect = "GgMm3";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("4")) {
            String doesNotConnect = "1EeFfGgMm4";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("5")) {
            String doesNotConnect = "1EeFfGgMm5";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("6")) {
            String doesNotConnect = "123AaCcGg6";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        } else if (startLine.equals("7")) {
            String doesNotConnect = "LlJjZz7";
            if (doesNotConnect.contains(toLine)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}