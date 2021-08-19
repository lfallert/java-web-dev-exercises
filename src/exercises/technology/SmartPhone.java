package exercises.technology;

public class SmartPhone extends Computer {

    //fields
    private String provider;

    //constructor
    public SmartPhone(int year, String brand, String color, String provider) {
        super(year, brand, color);
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    // methods
    public String checkProvider() {
        if (provider == "ATT") {
            return "Oh no, you probably should get a different provider.";
        } else {
            return "Your provider is " + provider;
        }
    }

}
