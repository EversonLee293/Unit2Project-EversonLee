import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubwayLine {
    private String lineName;

    ArrayList<String> subwayStations = new ArrayList<>(Arrays.asList("First Avenue"));

    public SubwayLine(String designation, String linesDoesNotConnect) {
        this.lineName = designation;
    }
}