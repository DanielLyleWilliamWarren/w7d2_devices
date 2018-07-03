import behaviours.IInput;

public class Mouse implements IInput {

    private String brand;
    private int buttons;
    private int dpi;


    public Mouse(String brand, int buttons, int dpi) {
        this.brand = brand;
        this.buttons = buttons;
        this.dpi = dpi;

    }

    @Override
    public String sendData(String data) {
        return null;
    }
}
