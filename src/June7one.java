abstract class ElectronicDevice {
    abstract void turnOn();
    abstract void turnOff();

    void checkBatteryStatus() {
        System.out.println("Checking battery status...");
    }
}

class Laptop extends ElectronicDevice {

    @Override
    public void turnOn(){
        System.out.println("Laptop is turning on.");
        System.out.println("Laptop is activating its hard drive.");
        System.out.println("Laptop is initializing its keyboard.");
        System.out.println("Laptop is connecting to the network via an Ethernet cable.");
    }

    @Override
    public void turnOff(){
        System.out.println("Laptop is turning off.");
        System.out.println("Laptop is shutting down its hard drive.");
        System.out.println("Laptop is disconnecting from the Ethernet cable.");
    }
}

class Smartphone extends ElectronicDevice {

    @Override
    public void turnOn(){
        System.out.println("Smartphone is turning on.");
        System.out.println("Smartphone is using its flash storage.");
        System.out.println("Smartphone is enabling its virtual keyboard.");
        System.out.println("Smartphone is connecting to the network via Wi-Fi.");
    }

    @Override
    public void turnOff(){
        System.out.println("Smartphone is turning off.");
        System.out.println("Smartphone is disabling its virtual keyboard.");
        System.out.println("Smartphone is disconnecting from Wi-Fi.");
    }
}

public class June7one {
    public static void main(String[] args) {
        ElectronicDevice device1 = new Laptop();
        ElectronicDevice device2 = new Smartphone();

        ElectronicDevice[] devices = {device1, device2};

        for (ElectronicDevice device : devices) {
            device.turnOn();
            device.turnOff();
            device.checkBatteryStatus();
            System.out.println();
        }
    }
}
