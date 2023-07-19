package address;

public class address {

    private final String country;
    private final String postalCode;
    private final String street;
    private final String floor;

    public address(String country, String postalCode, String street, String floor) {
        this.country = country;
        this.postalCode = postalCode;
        this.street = street;
        this.floor = floor;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "address{" +
                "country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}