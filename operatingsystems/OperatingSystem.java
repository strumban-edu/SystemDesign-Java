package operatingsystems;

interface OSType {
    String getName();
}

public abstract class OperatingSystem implements OSType {
    protected String version;
    private String machineName;

    public String machineGetter() {
        return this.machineName;
    }

    public void machineSetter(String machineString) {
        this.machineName = machineString;
    }

    public String getName() {
        return "Generic OS";
    }
}
