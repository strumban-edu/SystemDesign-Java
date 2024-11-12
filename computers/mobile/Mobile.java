package computers.mobile;

import computers.Computer;
import operatingsystems.mobile.MobileOS;

public abstract class Mobile extends Computer {
    protected String company;
    private MobileOS os = new MobileOS();

    public Mobile(String company) {
        this.company = company;
    }

    public Mobile() {
        this.company = "Unknown Mobile Device Manufacturor";
    }

    public void setOS(String version, String model) {
        this.os = new MobileOS(version, model);
    }

    public MobileOS getOS() {
        return this.os;
    }

    @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Generic Mobile Device";
    }
}

final class Phone extends Mobile {
    private String password;
    protected int memoryGB;

    public Phone(String company, int memory) {
        this.company = company;
        this.memoryGB = memory;
    }

    public Phone() {
        this.company = "Unknown Phone Manufacturor";
        this.memoryGB = 4;
    }

    public void passSetter(String password) {
        this.password = password;
    }

    public String passGetter() {
        return password;
    }

    @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Phone";
    }
}

final class Tablet extends Mobile {
    private String password;
    protected int memoryGB;

    public Tablet(String company, int memory) {
        this.company = company;
        this.memoryGB = memory;
    }

    public Tablet() {
        this.company = "Unknown Tablet Manufacturor";
        this.memoryGB = 4;
    }

    public void passSetter(String password) {
        this.password = password;
    }

    public String passGetter() {
        return password;
    }

    @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Tablet";
    }
}
