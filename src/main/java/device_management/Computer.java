package device_management;

import behaviours.IInput;
import behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;
    private String dataStream = null;

    private IOutput outputDevice;
private IInput inputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;

    }
    public void setInputDevice(IInput inputDevice) {
        this.inputDevice = inputDevice;

    }

    public String inputData(String input) {
        dataStream = input;
        return this.inputDevice.sendData(input);
    }

    public IInput getInputDevice() {
        return this.inputDevice;
    }

    public String outputDataStream(IOutput outputDevice){
        return outputDevice.outputData(dataStream);
    }
}
