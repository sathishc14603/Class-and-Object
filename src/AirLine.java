import java.time.LocalDateTime;

public class AirLine {
    private static String  AirlineName="SassAirLines";
    private static String AirlineCode="91Sass_TNX_76";
    private int flightNumber;
    private String airlineName;
    private String airlineCode;
    private String Destination;
    private String Source;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int Seat_cont;
    public AirLine() {}

    public AirLine(int flightNumber, String destination, String source, LocalDateTime departureTime, LocalDateTime arrivalTime, int seat_cont) {
        this.flightNumber = flightNumber;
        this.Destination = destination;
        this.Source = source;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.Seat_cont = seat_cont;
        airlineName=AirlineName;
        airlineCode=AirlineCode;
    }

    public static String getAirlineName() {
        return AirlineName;
    }

    public static void setAirlineName(String airlineName) {
        AirlineName = airlineName;
    }

    public static String getAirlineCode() {
        return AirlineCode;
    }

    public static void setAirlineCode(String airlineCode) {
        AirlineCode = airlineCode;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeat_cont() {
        return Seat_cont;
    }

    public void setSeat_cont(int seat_cont) {
        Seat_cont = seat_cont;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "flightNumber=" + flightNumber +
                ", airlineName='" + airlineName + '\'' +
                ", airlineCode='" + airlineCode + '\'' +
                ", Destination='" + Destination + '\'' +
                ", Source='" + Source + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", Seat_cont=" + Seat_cont +
                '}';
    }
}
