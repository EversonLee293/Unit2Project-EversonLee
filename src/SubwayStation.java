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
        if (linesInService.contains(subwayLine)) {
            return true;
        }
        return false;
    }
}
