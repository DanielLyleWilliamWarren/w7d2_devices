import behaviours.IInput;

public class Keyboard implements IInput {

    private String brand;
    private String region;


    public Keyboard(String brand, String region) {
        this.brand = brand;
        this.region = region;
    }

    @Override
    public String sendData(String data) {
        return data;
    }
}
