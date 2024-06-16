package Entity;

public class Location {
    private String city;
    private String area;
    private int pinCode;
    private String state;
    private String country;

    public Location(String city, int pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    public Location(String city, String area, int pinCode, String state, String country) {
        this.city = city;
        this.area = area;
        this.pinCode = pinCode;
        this.state = state;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
