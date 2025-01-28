package lab13.task4;

public class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;
    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }
    public void operateNewFunction() {
        this.oldDevice.operateOldFunction();
    }

}
