package operatingsystems.desktop;

import operatingsystems.OperatingSystem;

public class DesktopOS extends OperatingSystem {
    private int usersNum;
    protected String platform;

    public DesktopOS(String version, String platform) {
        this.version = version;
        this.platform = platform;
    }

    public DesktopOS() {
        this.version = "Unknown";
        this.platform = "Unknown";
    }

    public int userNumGetter() {
        return this.usersNum;
    }

    public void userNumSetter(int users) {
        this.usersNum = users;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Desktop";
    }
}

final class Windows extends DesktopOS {
    private String platform = "Windows";
    protected String version;

    public Windows(String version) {
        this.version = version;
    }

    public Windows() {
        this.version = "Unknown";
    }

    public String platformGetter() {
        return this.platform;
    }

    public void platformSetter(String platformString) {
        this.platform = platformString;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Windows";
    }
}

final class MacOS extends DesktopOS {
    private String platform = "MacOS";
    protected String model;

    public MacOS(String version) {
        this.version = version;
    }

    public MacOS() {
        this.version = "Unknown";
    }

    public String platformGetter() {
        return this.platform;
    }

    public void platformSetter(String platformString) {
        this.platform = platformString;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "MacOS";
    }
}

class Linux extends DesktopOS {
    private String platform = "Linux";
    protected String distro;

    public Linux(String version, String distro) {
        this.version = version;
        this.distro = distro;
    }

    public Linux() {
        this.version = "Unknown";
        this.distro = "Unknown";
    }

    public String platformGetter() {
        return this.platform;
    }

    public void platformSetter(String platformString) {
        this.platform = platformString;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Linux";
    }
}
