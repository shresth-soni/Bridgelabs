interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

public class DeviceDemo {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice tv = new TV();
        SmartDevice ac = new AC();

        light.turnOn();
        tv.turnOn();
        ac.turnOff();
    }
}
