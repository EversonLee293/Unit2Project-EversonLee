public class SubwayStation {
    // ArrayList<String> subwayStations = new ArrayList<>(Arrays.asList("First Avenue"));
    private String stationName;
    private String linesInService;

    public SubwayStation(String name, String linesServing) {
        this.stationName = name;
        this.linesInService = linesServing;
    }

    public String getLinesServing() {

        return linesInService;
    }

    public String getStationName() {
        return stationName;
    }

    public boolean servesStation(String subwayLine) {
        for (int i = 0; i < linesInService.length() - 1; i++) {
            if (linesInService.substring(i, i+1).equalsIgnoreCase(subwayLine)) {
                return true;
            }
        }
        return false;
    }
}
