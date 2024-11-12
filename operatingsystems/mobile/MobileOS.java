package operatingsystems.mobile;

import operatingsystems.OperatingSystem;

public class MobileOS extends OperatingSystem {
    private boolean isOpenSourced;
    protected String model;
    
    public MobileOS(String version, String model) {
        this.version = version;
        this.model = model;
    }

    public MobileOS() {
        this.version = "Unknown";
        this.model = "Generic";
    }

    protected boolean openSourceGetter() {
        return this.isOpenSourced;
    }

    protected void openSourceSetter(boolean openSourceStatus) {
        this.isOpenSourced = openSourceStatus;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Mobile";
    }
}

final class iOS extends MobileOS {
    private boolean isOpenSourced = false;
    private String platform = "iOS";
    protected String model;

    public iOS(String version) {
        this.version = version;
    }

    public iOS() {
        this.version = "Unknown";
    }

    public boolean openSourceGetter() {
        return this.isOpenSourced;
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
        return "iOS";
    }
}

class Android extends MobileOS {
    private String platform = "Android";
    protected String distro;

    public Android(String version, String distro) {
        this.version = version;
        this.distro = distro;
        
    }

    public Android() {
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
        return "Android";
    }
}
