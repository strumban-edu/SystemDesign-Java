package computers.personalcomputer;

import computers.Computer;
import operatingsystems.desktop.DesktopOS;

public abstract class PC extends Computer {
    protected String company;
    private DesktopOS os = new DesktopOS();

    public PC(String company) {
        this.company = company;
    }

    public PC() {
        this.company = "Unknown Personal Computer Manufacturor";
    }

    public void setOS(String version, String platform) {
        this.os = new DesktopOS(version, platform);
    }

    public DesktopOS getOS() {
        return this.os;
    }

     @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Generic Personal Computer";
    }
}

final class Desktop extends PC {
    private int memoryGB;
    protected String userName;

    public Desktop(String company, int memory, String userName) {
        this.company = company;
        this.memoryGB = memory;
        this.userName = userName;
    }

    public Desktop() {
        this.company = "Unknown Desktop Manufacturor";
        this.memoryGB = 8;
        this.userName = "Guest";
    }

    public int getMemory() {
        return this.memoryGB;
    }

    public void setMemory(int memory) {
        this.memoryGB = memory;
    }

    @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Desktop";
    }
}

final class Laptop extends PC {
    private String modelNumber;
    protected int memoryGB;

    public Laptop(String company, String modelNumber, int memory) {
        this.company = company;
        this.modelNumber = modelNumber;
        this.memoryGB = memory;
    }

    public Laptop() {
        this.company = "Unknown Laptop Manufacturor";
        this.modelNumber = "Unknown";
        this.memoryGB = 8;
    }

    public void setModelNum(String modelNum) {
        this.modelNumber = modelNum;
    }

    public String getModelNum() {
        return this.modelNumber;
    }

    @Override
    public String getFormFactor() {
        // TODO Auto-generated method stub
        return "Laptop";
    }
}
