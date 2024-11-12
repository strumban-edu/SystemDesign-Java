package computers;

interface power {
    void togglePower();
    boolean isOn();
}

interface formFactor {
    String getFormFactor();
}

public abstract class Computer implements power, formFactor {
    private int[] ipAddress = new int[]{0, 0, 0, 0};
    protected boolean isOn = false;

    public Computer(int[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Computer() {
        this.ipAddress = new int[]{192, 168, 1, 1};
    }

    public int[] getIP() {
        return this.ipAddress;
    }

    public void togglePower() {
        if (this.isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
        }
    }

    public boolean isOn() {
        // TODO Auto-generated method stub
        return this.isOn;
    }

    public String getFormFactor() {
        return "Generic Computer";
    }
}
