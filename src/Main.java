import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<String> stationData = getFileData("src/stations");
        ArrayList<SubwayStation> stations = new ArrayList<SubwayStation>();

        for (int i = 0; i < stationData.size(); i++) {
            String line = stationData.get(i);
            String stationName = line.split(",")[0];
            String stationLine = line.split(",")[1];
            SubwayStation s = new SubwayStation(stationName, stationLine);
            stations.add(s);
        }



        // Below adds all subway stations :

//        SubwayStation firstAvenue = new SubwayStation("First Avenue", "L");
//        SubwayStation secondAvenue = new SubwayStation("Second Avenue", "F");
//        SubwayStation ThirdAvenueL = new SubwayStation("Third Avenue", "L");
//        SubwayStation ThirdAvenue138 = new SubwayStation("Third Avenue-138th Street", "6");
//        SubwayStation ThirdAvenue149 = new SubwayStation("Third Avenue-149th Street", "25");
//        SubwayStation WestFourthStreet = new SubwayStation("West Fourth Street-Washington Square", "ABCDEFM");
//        SubwayStation FourthAvenue = new SubwayStation("Fourth Avenue-Ninth Street", "FGR");
//        SubwayStation FifthAvenue53 = new SubwayStation("Fifth Avenue-53rd Street", "EM");
//        SubwayStation FifthAvenue59 = new SubwayStation("Fifth Avenue-59th Street", "RNW");
//        SubwayStation BryantPark7 = new SubwayStation("Fifth Avenue-Bryant Park", "7");
//        SubwayStation SixthAvenue = new
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}