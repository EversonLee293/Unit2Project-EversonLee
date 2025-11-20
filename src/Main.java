import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean firstPhase = true;
        boolean secondPhase = false;
        boolean thirdPhase = false;
        boolean completed = false;

        ArrayList<String> stationData = getFileData("src/stations");
        ArrayList<SubwayStation> stations = new ArrayList<SubwayStation>();

        for (int i = 0; i < stationData.size(); i++) {
            String line = stationData.get(i);
            String stationName = line.split(",")[0];
            String stationLine = line.split(",")[1];
            SubwayStation s = new SubwayStation(stationName, stationLine);
            stations.add(s);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Get from ");

        int startingStationChoice = (int) (Math.random() * stations.toArray().length);
        SubwayStation startingStation = stations.get(startingStationChoice);
        System.out.print(startingStation.getStationName());

        System.out.print(" to ");

        int endingStationChoice = (int) (Math.random() * stations.toArray().length);
        if (endingStationChoice == startingStationChoice) {
            if (endingStationChoice < stations.toArray().length) {
                endingStationChoice += 1;
            } else {
                endingStationChoice -= 1;
            }
        }
        SubwayStation endingStation = stations.get(endingStationChoice);

        System.out.print(endingStation.getStationName());

        System.out.println(" using two transfers.");
        System.out.println("--------------------------------------------------------------------------------");

        String subwayLinesString = "1234567AaBbCcDdEeFfGgJjLlMmNnQqRrSsWwZz";
        String globalCurrentLine = "";

        while (!completed) {
            while (firstPhase) {
                System.out.print("What train would you like to start from? ");
                String startingSubwayLine = scan.nextLine();
                if (startingSubwayLine.equalsIgnoreCase("")) {
                    System.out.println("You didn't enter a line. Try again.");
                } else {
                    boolean serveStation = startingStation.servesStation(startingSubwayLine);
                    if (serveStation) {
                        firstPhase = false;
                        globalCurrentLine = startingSubwayLine;
                        secondPhase = true;
                    } else if (subwayLinesString.contains(startingSubwayLine)) {
                        System.out.println("That line doesn't go there. Try again.");
                    } else {
                        System.out.println("That's not a subway line. Try again.");
                    }
                }
                //System.out.println(serveStation);
            }

            while (secondPhase) {
                System.out.print("What train will you transfer to first? ");
                String transferSubwayLine = scan.nextLine();
                if (transferSubwayLine.equalsIgnoreCase("")) {
                    System.out.println("You didn't enter a line. Try again.");
                } else {
                    boolean lineConnects = SubwayLine.lineConnects(globalCurrentLine, transferSubwayLine);
                    //System.out.println(lineConnects);
                    if (lineConnects) {
                        secondPhase = false;
                        globalCurrentLine = transferSubwayLine;
                        thirdPhase = true;
                    } else if (subwayLinesString.contains(transferSubwayLine)) {
                        System.out.println("There's no station in the subway where you can transfer to that line. Try again.");
                    } else {
                        System.out.println("That's not a subway line. Try again.");
                    }
                }
            }

            while (thirdPhase) {
                System.out.print("What train will you transfer to next? ");
                String secondTransferSubwayLine = scan.nextLine();
                if (secondTransferSubwayLine.equalsIgnoreCase("")){
                    System.out.println("You didn't enter a line. Try again.");
                } else {
                    boolean lineConnects = SubwayLine.lineConnects(globalCurrentLine, secondTransferSubwayLine);
                    boolean endsAtStation = endingStation.servesStation(secondTransferSubwayLine);
                    //System.out.println(lineConnects);
                    if (lineConnects && endsAtStation) {
                        thirdPhase = false;
                        completed = true;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("You made it to your destination!");
                        System.out.println("--------------------------------------------------------------------------------");
                    } else if (subwayLinesString.contains(secondTransferSubwayLine) && lineConnects || endsAtStation) {
                        System.out.println("That transfer does not get you to the final station. Try again on your first transfer.");
                        thirdPhase = false;
                        secondPhase = true;
                    }  else {
                        System.out.println("That's not a subway line. Try again.");
                    }
                }

            }
        }

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