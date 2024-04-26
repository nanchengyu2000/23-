package Flyweight;

public class Test {
    public static void main(String[] args) {
        DeviceFactory instance = DeviceFactory.getInstance();
        instance.addDevice(new Hub("������1"));
        instance.addDevice(new Switch("������1"));
        NetworkDevice hub = instance.getNetworkDevice("������1");
        hub.Use(new Port("8081"));
        System.out.println(instance.getTotalDevice());
        System.out.println(instance.getTotalTerminal());
    }
}
