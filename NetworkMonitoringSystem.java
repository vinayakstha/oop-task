public class NetworkMonitoringSystem {
    public void DeviceStatus(NetworkDevice device) {
        if (device.isAvailable()) {
            System.out.println(device.getID() + " is running");
        } else {
            System.out.println(device.getID() + " is encountering issues");
        }
    }

    public static void main(String[] args) {
        NetworkDevice router1 = new Router("Router1", "HCX-ISJ-2GD-399", "on");
        NetworkDevice switch1 = new Switch("Switch1", "HCX-ISJ-2GD-399", "off");
        NetworkDevice Hub1 = new Hub("Hub1", "HCX-ISJ-2GD-399", "off");

        NetworkMonitoringSystem nms = new NetworkMonitoringSystem();
        nms.DeviceStatus(router1);
        nms.DeviceStatus(switch1);
        nms.DeviceStatus(Hub1);
    }
}

interface NetworkDevice {
    String getID();

    String getStatus();

    boolean isAvailable();

}

class Router implements NetworkDevice {
    private String RouterID;
    private String physical_address;
    private String status;

    Router(String RouterID, String physical_address, String status) {
        this.RouterID = RouterID;
        this.physical_address = physical_address;
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return status.equals("on");
    }

    @Override
    public String getID() {
        return RouterID;
    }

}

class Switch implements NetworkDevice {
    private String SwitchID;
    private String physical_address;
    private String status;

    Switch(String SwitchID, String physical_address, String status) {
        this.SwitchID = SwitchID;
        this.physical_address = physical_address;
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return status.equals("on");
    }

    @Override
    public String getID() {
        return SwitchID;
    }

}

class Hub implements NetworkDevice {
    private String HubID;
    private String physical_address;
    private String status;

    Hub(String HubID, String physical_address, String status) {
        this.HubID = HubID;
        this.physical_address = physical_address;
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return status.equals("on");
    }

    @Override
    public String getID() {
        return HubID;
    }

}