package guru.springframework.spring5webapp.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String firstLine;
    private String city;
    private String state;
    private String zip;

    public Address(String firstLine, String city, String state, String zip) {
        this.firstLine = firstLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
