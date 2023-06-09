package day34_tasks;

public class FlightTicket {
    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }

    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public String getType() {
        return type;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }
    public void setType(String type) {
        if(type.equalsIgnoreCase("first")||type.equalsIgnoreCase("business")||type.equalsIgnoreCase("economy")) {
            this.type = type;
        }else{
            System.out.println("Invalid type");
        }
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public FlightTicket(String type, String departureLocation, String arrivalLocation){
        setType(type);
        setDepartureLocation(departureLocation);
        setArrivalLocation(arrivalLocation);
    }
}
